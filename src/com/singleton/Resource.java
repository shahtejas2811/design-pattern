package com.singleton;

/**
 * Double check locking wiht lazy loading singleton Desing pattern
 * 
 * @author Tejas
 *
 */
public class Resource {

	private static volatile Resource instance;

	// create a private constructor to prevent  direct calling from outside
	private Resource() {

	}

	public static Resource getInstance() {
		// 1st check
		if (instance == null) {
			// locking
			synchronized (instance) {
				// 2nd check
				if (instance == null) {
					// following statement is combination of 3 compound
					// operation
					// 1. Construct empty object
					// 2. Call constructor to initialized fields
					// 3. Object assign to Ref variable

					instance = new Resource();

				}
			}

		}
		return instance;
	}
}
