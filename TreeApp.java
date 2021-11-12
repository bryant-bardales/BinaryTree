package BinaryTree;

import java.io.*;

class TreeApp
{
	public static void main(String[] args) throws IOException
	{
		int value;
		Tree theTree = new Tree();

		theTree.insert(27);
		theTree.insert(20);
		theTree.insert(33);
		theTree.insert(4);
		theTree.insert(26);
		theTree.insert(28);
		theTree.insert(41);
		theTree.insert(1);
		theTree.insert(9);
		theTree.insert(25);
		theTree.insert(32);
		theTree.insert(40);
		theTree.insert(47);
		theTree.insert(2);
		theTree.insert(11);
		theTree.insert(39);

		while(true)
		{
			System.out.print("Enter first letter of show, ");
			System.out.print("insert, find, delete, traverse, smallest: ");
			int choice = getChar();
			switch(choice)
			{
			case 's':
				theTree.displayTree();
				break;
			case 'i':
				System.out.print("Enter value to insert: ");
				value = getInt();
				theTree.insert(value);
				break;
			case 'f':
				System.out.print("Enter value to find: ");
				value = getInt();
				Node found = theTree.find(value);
				if(found != null)
				{
					System.out.print("Found: ");
					found.displayNode();
					System.out.print("\n");
				}
				else
					System.out.print("Could not find ");
				System.out.print(value + '\n');
				break;
			case 'd':
				System.out.print("Enter value to delete: ");
				value = getInt();
				boolean didDelete = theTree.delete(value);
				if(didDelete)
					System.out.print("Deleted " + value + '\n');
				else
					System.out.print("Could not delete ");
				System.out.print(value + '\n');
				break;
			case 't':
				System.out.print("Enter type 1, 2 or 3: ");
				value = getInt();
				theTree.traverse(value);
				break;
			case 'o':
				theTree.smallest();
				break;
			default:
				System.out.print("Invalid entry\n");
			}  // end switch
		}  // end while
	}  // end main()
	//-------------------------------------------------------------
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	//-------------------------------------------------------------
	public static char getChar() throws IOException
	{
		String s = getString();
		return s.charAt(0);
	}
	//-------------------------------------------------------------
	public static int getInt() throws IOException
	{
		String s = getString();
		return Integer.parseInt(s);
	}
	//-------------------------------------------------------------
}  // end class TreeApp
