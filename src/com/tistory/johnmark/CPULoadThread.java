package com.tistory.johnmark;

public class CPULoadThread extends Thread {
	private final double load;
	private final long duration;

	public CPULoadThread(String name, double load, long duration) {
		super(name);
		this.load = load;
		this.duration = duration;
	}

	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		try {
			while (System.currentTimeMillis() - startTime < duration) {
				if (System.currentTimeMillis() % 100 == 0) {
					sleep((long)Math.floor((1 - load) * 100));
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
