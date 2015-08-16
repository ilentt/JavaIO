package ilentt.ilenlab.com.varargs;

import org.junit.Test;

public class VarArgsTest {

	@Test
	public void testMain() {
		VarArgs.main(new String[] {});
	}

	@Test
	public void testGetArgs() {
		VarArgs v = new VarArgs();
		v.getArgs(15.6,34.5,32.7);
	}
}
