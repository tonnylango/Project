// Part of SourceAFIS: https://sourceafis.machinezoo.com
package sourcefiles;

class Integers {
	static int sq(int value) {
		return value * value;
	}
	static int roundUpDiv(int dividend, int divisor) {
		return (dividend + divisor - 1) / divisor;
	}
}
