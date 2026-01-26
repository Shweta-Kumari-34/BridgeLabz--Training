package coderepocleanertool;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

class CodeRepoCleaner {

    List<Path> javaFiles = new ArrayList<>();
    Map<String, List<File>> fileMap = new HashMap<>();
    Set<String> fileTypes = new HashSet<>();

    CodeRepoCleaner() {
        fileMap.put("valid", new ArrayList<>());
        fileMap.put("warnings", new ArrayList<>());
        fileMap.put("errors", new ArrayList<>());
    }

    void scanFolder(String folderPath) throws IOException {
        Files.walk(Paths.get(folderPath))
             .filter(p -> p.toString().endsWith(".java"))
             .forEach(javaFiles::add);
    }

    void analyzeFiles() {
        Pattern badMethod = Pattern.compile("void [A-Z].*\\(");
        Pattern unusedImport = Pattern.compile("import .*;");

        for (Path path : javaFiles) {
            try {
                List<String> lines = Files.readAllLines(path);
                boolean warning = false;

                for (String line : lines) {
                    if (badMethod.matcher(line).find()) {
                        warning = true;
                    }
                }

                File file = path.toFile();
                fileTypes.add("java");

                if (warning)
                    fileMap.get("warnings").add(file);
                else
                    fileMap.get("valid").add(file);

            } catch (Exception e) {
                fileMap.get("errors").add(path.toFile());
            }
        }
    }

    void filterBySize(long size) {
        javaFiles.stream()
                 .map(Path::toFile)
                 .filter(f -> f.length() > size)
                 .forEach(f -> System.out.println(f.getName()));
    }

    void printResult() {
        System.out.println("valid files: " + fileMap.get("valid").size());
        System.out.println("warnings: " + fileMap.get("warnings").size());
        System.out.println("errors: " + fileMap.get("errors").size());
    }

    public static void main(String[] args) throws IOException {
        CodeRepoCleaner crc = new CodeRepoCleaner();
        crc.scanFolder("src");
        crc.analyzeFiles();
        crc.filterBySize(500);
        crc.printResult();
    }
}

