package com.github.diegopacheco.sandbox.java.process;

/**
 * The idea behind PIDChecker is to be able to check if a PID is alive. most of times just running PS AUX. 
 * Also check if pid is doing progress most of times just checking LOGS for new messages absent of errors.
 * However this is a plugable interface and you check however you want.
 * 
 * @author diegopacheco
 *
 */
public interface ProcessChecker {
	
	public boolean hasCompleted(PIDMetadata pim);
	public boolean isDoingProgress(PIDMetadata pim);
	
}
