
import java.util.*;
import java.io.*;


public class Main {

	private static Scanner cin;

	public static void main(String[] args) throws FileNotFoundException {
		
        FileInputStream fis=new FileInputStream("D://week1execrise.in");
        //����׼�����ض���fis������
        System.setIn(fis);
        //ʹ��System.in����Scanner����,���ڻ�ȡ��׼����
        
        //Scanner sc=new Scanner(System.in);
        //��������һ��ֻ�ѻس���Ϊ�ָ���
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
