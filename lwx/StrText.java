package lwx;

import java.util.Scanner;
class A{
	public static void main(String[] args) {
		String[]strings={"������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯"};
		StrText.main(strings);
	}//��Ӳ������������޸衷�����Ž�String[]������
}

public class StrText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
			throw new IllegalArgumentException("�������ַ�����");//ʹ��A��String[]�Ĳ���
		String res=args[0];
		//������ʹ��forѭ�����ʵ�ֶ��ַ��������Լ����ŵı༭
		for(int i=0;i<res.length();i++){
			char c=res.charAt(i);
			System.out.print(c);
			if((i+1)%14==0){//ÿ14���ַ����һ��������
				System.out.println("��");
				continue;
			}
			else if((i+1)%7 ==0)//ÿ7���ַ����һ��������
				System.out.print(",");
		}
		System.out.println("������Ҫ�����������ַ���");
		Scanner reader=new Scanner(System.in);//���ռ���������ַ�
		String find=reader.nextLine();
		countString(res,find);
	}

	private static void countString(String str, String s) {
		// TODO Auto-generated method stub
		int count=0;
		while(str.indexOf(s)!=-1){
			str=str.substring(str.indexOf(s)+1,str.length());//���Ҳ����ں�����һ�����ַ���������
			count++;
		}
		System.out.println(s+"���ֵĴ����ǣ�"+count);
	}
}
class B{
	public static void main(String[] args){
		String[]s={""};
		StrText.main(s);
	}
}
