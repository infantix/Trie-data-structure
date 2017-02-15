package com.infantino.stefano.trie.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TrieNode {
	
	Map<Character, TrieNode> children;
	TrieNode currentNode;
	
	public TrieNode() {
		children = new HashMap<>();
		currentNode = this;
	}
	
	public void insert(String...words) {
		for(String word : Arrays.asList(words)) {
			currentNode = this;
			insertWord(word);
		}
	}
	
	private void insertWord(String word) {
		char c = word.charAt(0);
			if(currentNode.children.containsKey(c)) {
				currentNode = currentNode.children.get(c);
			}
			else {
				TrieNode newNode = new TrieNode();
				currentNode.children.put(c, newNode);
				currentNode = newNode;
			}
			if(word.length() > 1)
				insertWord(word.substring(1));
	}
	
	public void print(TrieNode node) {
		for(Entry<Character, TrieNode> entry: node.children.entrySet()) {
			System.out.println(entry.getKey());
			print(entry.getValue());
		}
	}
	
	public boolean contains(String word) {
		currentNode = this;
		return searchWord(word);
	}
	
	private boolean searchWord(String word) {
		char c = word.charAt(0);
		if(currentNode.children.containsKey(c)) {
			if(word.length() > 1) {
				currentNode = currentNode.children.get(c);
				return searchWord(word.substring(1));
			}
			else
				return true;
		}
		return false;
	}
	
}














