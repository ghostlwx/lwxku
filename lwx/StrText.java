package lwx;

import java.util.Scanner;
class A{
	public static void main(String[] args) {
		String[]strings={"汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝"};
		StrText.main(strings);
	}//添加参数，将《长恨歌》参数放进String[]数组中
}

public class StrText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
			throw new IllegalArgumentException("请输入字符串：");//使用A中String[]的参数
		String res=args[0];
		//接下来使用for循环语句实现对字符串长度以及符号的编辑
		for(int i=0;i<res.length();i++){
			char c=res.charAt(i);
			System.out.print(c);
			if((i+1)%14==0){//每14个字符添加一个“。”
				System.out.println("。");
				continue;
			}
			else if((i+1)%7 ==0)//每7个字符添加一个“，”
				System.out.print(",");
		}
		System.out.println("输入想要搜索数量的字符：");
		Scanner reader=new Scanner(System.in);//接收键盘输入的字符
		String find=reader.nextLine();
		countString(res,find);
	}

	private static void countString(String str, String s) {
		// TODO Auto-generated method stub
		int count=0;
		while(str.indexOf(s)!=-1){
			str=str.substring(str.indexOf(s)+1,str.length());//查找参数内和输入一样的字符，并计数
			count++;
		}
		System.out.println(s+"出现的次数是："+count);
	}
}
class B{
	public static void main(String[] args){
		String[]s={""};
		StrText.main(s);
	}
}
