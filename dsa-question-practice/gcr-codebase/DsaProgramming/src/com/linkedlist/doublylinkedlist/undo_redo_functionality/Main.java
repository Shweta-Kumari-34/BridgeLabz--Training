package com.linkedlist.doublylinkedlist.undo_redo_functionality;

public class Main {
	public class MainClass {
	    public static void main(String[] args) {

	        TextEditor editor = new TextEditor();

	        editor.addState("Hello");
	        editor.addState("Hello World");
	        editor.addState("Hello World!");
	        editor.displayCurrentState();

	        editor.undo();
	        editor.displayCurrentState();

	        editor.undo();
	        editor.displayCurrentState();

	        editor.redo();
	        editor.displayCurrentState();

	        editor.addState("Hello Java");
	        editor.displayCurrentState();

	        editor.redo(); // should not redo
	    }
	}

}
