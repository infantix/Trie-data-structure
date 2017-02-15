package com.infantino.stefano.trie.main;

import com.infantino.stefano.trie.model.TrieNode;

public class Main {

	public static void main(String[] args) {
		
		TrieNode tn = new TrieNode();
		tn.insert("albero", "alberto");
		
		if(tn.contains("albero")) {
			System.out.println("albero");
		}
		
		if(tn.contains("alberto")) {
			System.out.println("alberto");
		}
		
		if(tn.contains("mario")) {
			System.out.println("mario");
		}

	
	}

}
