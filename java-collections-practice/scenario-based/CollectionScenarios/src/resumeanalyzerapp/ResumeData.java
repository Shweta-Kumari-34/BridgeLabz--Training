package resumeanalyzerapp;

import java.util.List;

public class ResumeData {

	private String email;
	private String phone;
	private List<String> keywords;

	public ResumeData(String email, String phone, List<String> keywords) {
		this.email = email;
		this.phone = phone;
		this.keywords = keywords;
	}

	public int getMatchCount() {
		return keywords.size();
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	@Override
	public String toString() {
		return "Email: " + email + ", Phone: " + phone + ", Skills: " + keywords + ", MatchCount: " + getMatchCount();
	}
}
