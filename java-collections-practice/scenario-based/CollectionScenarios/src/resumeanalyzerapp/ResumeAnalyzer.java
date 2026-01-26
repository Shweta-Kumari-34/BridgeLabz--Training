package resumeanalyzerapp;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {

	// Keywords to search
	private static final String[] KEYWORDS = { "java", "python", "spring" };

	// Regex patterns
	private static final Pattern EMAIL_PATTERN = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

	private static final Pattern PHONE_PATTERN = Pattern.compile("\\b\\d{10}\\b");

	// Map to store resumes by email
	private Map<String, ResumeData> resumeMap = new HashMap<>();

	// MAIN METHOD
	public static void main(String[] args) {

		ResumeAnalyzer analyzer = new ResumeAnalyzer();

		//FOLDER PATH 
		String folderPath = "D:\\java file\\Resume";

		analyzer.processResumes(folderPath);

		List<ResumeData> sortedCandidates = analyzer.getSortedCandidates();

		System.out.println("------------------- Sorted Candidates -----------------------");
		System.out.println("\n***********************************************************\n");
		for (ResumeData data : sortedCandidates) {
			System.out.println(data);
		}
		System.out.println("\n************************************************************");
	}
	

	//Read resumes from folder
	public void processResumes(String folderPath) {

		File folder = new File(folderPath);
		File[] files = folder.listFiles();

		if (files == null) {
			System.out.println("Invalid folder path");
			return;
		}

		for (File file : files) {
			try {
				// Allow only .txt files
				if (!file.getName().endsWith(".txt")) {
					throw new UnsupportedOperationException("Invalid file format");
				}

				String content = readFile(file);

				String email = extractEmail(content);
				String phone = extractPhone(content);
				List<String> matchedKeywords = extractKeywords(content);

				// Email is mandatory
				if (email == null) {
					throw new IllegalArgumentException("Email not found");
				}

				ResumeData data = new ResumeData(email, phone, matchedKeywords);
				resumeMap.put(email, data);

			} catch (Exception e) {
				System.out.println("Skipping file: " + file.getName());
			}
		}
	}

	//Read file using BufferedReader
	private String readFile(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		StringBuilder sb = new StringBuilder();
		String line;

		while ((line = br.readLine()) != null) {
			sb.append(line).append(" ");
		}

		br.close();
		return sb.toString().toLowerCase();
	}

	//Extract email
	private String extractEmail(String text) {
		Matcher matcher = EMAIL_PATTERN.matcher(text);
		return matcher.find() ? matcher.group() : null;
	}

	//Extract phone
	private String extractPhone(String text) {
		Matcher matcher = PHONE_PATTERN.matcher(text);
		return matcher.find() ? matcher.group() : "not found";
	}

	// Extract keywords
	private List<String> extractKeywords(String text) {
		List<String> found = new ArrayList<>();
		for (String keyword : KEYWORDS) {
			if (text.contains(keyword)) {
				found.add(keyword);
			}
		}
		return found;
	}

	// Sort candidates by keyword count
	public List<ResumeData> getSortedCandidates() {
		List<ResumeData> list = new ArrayList<>(resumeMap.values());
		list.sort((a, b) -> b.getMatchCount() - a.getMatchCount());
		return list;
	}
}
