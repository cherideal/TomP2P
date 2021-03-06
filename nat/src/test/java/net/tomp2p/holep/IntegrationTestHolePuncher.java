package net.tomp2p.holep;

import java.io.IOException;

import org.junit.Test;

public class IntegrationTestHolePuncher extends AbstractTestHoleP {

	@Test
	public void testHolePunchPortPreserving() throws ClassNotFoundException, IOException {
		System.err.println("PortPreserving() start!");
		doTest();
	}

	@Test
	public void testRelayFallback() throws ClassNotFoundException, IOException {
		((HolePInitiatorImpl) unreachable1.peerBean().holePunchInitiator()).testCase(true);
		System.err.println("testRelayFallback() start!");
		doTest();
	}
}
