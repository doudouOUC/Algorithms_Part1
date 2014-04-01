
import java.util.*;
import java.io.*;


public class Main {

	private static Scanner cin;

	public static void main(String[] args) throws FileNotFoundException {
		
        FileInputStream fis=new FileInputStream("D://week1execrise.in");
        //将标准输入重定向到fis输入流
        System.setIn(fis);
        //使用System.in创建Scanner对象,用于获取标准输入
        
        //Scanner sc=new Scanner(System.in);
        //增加下面一行只把回车作为分隔符
        cin = new Scanner(System.in);
        //cin.useDelimiter("");
        
		
		int p, q;
		//QuickFindUF uf = new QuickFindUF(10);
		QuickUnionUF uf = new QuickUnionUF(10);
		while(cin.hasNext()){
			
			p = cin.nextInt();
			q = cin.nextInt();
			if(!uf.conneted(p, q))
				uf.union(p, q);
		}
		uf.printIDs();
	}

}
