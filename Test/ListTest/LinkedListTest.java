/**
 * 
 */
package ListTest;

import java.util.ArrayList;

import org.junit.Before;

import LinkedList.LinkedList;


/**
 * @author downey
 *
 */
public class LinkedListTest extends ArrayListTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		mylist = new LinkedList<Integer>();
		mylist.addAll(list);
	}
}
