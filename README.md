## 实验  字符串实验

## 一、实验目的
*掌握字符串String及其方法的使用
*掌握异常处理
## 二、要求:
* 1、    每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
* 2、	允许提供参数，统计古诗中某个字或词出现的次数
* 3、	考虑操作中可能出现的异常，在程序中设计异常处理程序

## 三、实验代码  

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

## 四、效果的实现
![image](https://github.com/ghostlwx/lwxku/blob/master/three.png)
## 五、实验总结   
通过本次的实验学习，受益匪浅。用Java对字符串的排版。如何将一长串的字符串经过编辑，排版成想要的格式。本次实验我尝试使用参数，配合String[]的数组，在把数组内的字符串信息进行更改。其实设计成七言律诗的格式并添加上标点符号，用if条件语句就可以实现。查找字符出现的次数，用indexOf等实现
