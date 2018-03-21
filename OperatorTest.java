/*
<<(左移)：最高位丢弃，右边补齐0；
>>（右移）：最高位是0，左边0补齐，最高位是1，左边1补齐
>>>(无符号右移)：无论最高位是0还是1，左边补齐0
*/
class OperatorTest{
	public static void main(String[] args){
	//<< 把<< 左边的数据*2的移动次幂
	//>> 把>>左边的数据/2的移动次幂
	//>>> 把>>>左边的数据/2的移动次幂
		System.out.println(3<<2);//3*2^2=3*12
		System.out.println(5>>2);//5/2^2=5/4=1
        System.out.println(5>>>2);//5/2^2= 5/4=1
        System.out.println(-4<<2);
        System.out.println(-4>>2);
        System.out.println(-4>>>2);
	}
}
/*：
计算出3的二进制数：
			00000000 00000000 00000000 00000011
	  （00）00000000 00000000 00000000 00001100
	  结果是：12
*/
/*
计算-4的二进制数
（原码）10000000 00000000 00000000 00000100
        (10)00000000 00000000 00000000 00010000（错了）

反码：11111111 11111111 11111111 11111011
补码：11111111 11111111 11111111 11111100
 补码:11111111 11111111 11111111 11110000
 反码11111111 11111111 11111111 11101111
 原码 10000000 00000000 00000000 00010000
 结果是：-16
 2*8 最有效率的计算方式:
 2<<3








 */