package com.multithreading;

import java.util.Stack;
import java.util.Vector;

class PrintAlphanumric {
	boolean turn = false;

	void printAlphabet(char c) {
		while (!turn) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(c);
		turn=false;
		notify();
	}

	void printNumeric(int i) {
		while (turn) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(i);
		turn =true;
		notify();
		
	}
}

class Alphabet implements Runnable {
	PrintAlphanumric p;
	char c = 'A';
	int i = 0;

	public Alphabet(PrintAlphanumric p) {
		this.p = p;

	}

	@Override
	public void run() {
		synchronized (p) {
			while (i < 3) {
				p.printAlphabet(c);
				i++;c++;
			}
		}
	}
}

class Numeric implements Runnable {
	PrintAlphanumric p;
	int i = 0;

	public Numeric(PrintAlphanumric p) {
		this.p = p;

	}

	@Override
	public void run() {
		synchronized (p) {
			while (i < 3) {
				p.printNumeric(i);
				i++;
			}
		}
	}
}

public class MultiThreading {
	public static void main(String[] args) {
		Stack<Integer> kj = new Stack<Integer>();
		Vector<E>
		PrintAlphanumric alphaNumeric = new PrintAlphanumric();
		Thread t1 = new Thread(new Alphabet(alphaNumeric));
		Thread t2 = new Thread(new Numeric(alphaNumeric));
		t1.start();
		t2.start();

	}

}