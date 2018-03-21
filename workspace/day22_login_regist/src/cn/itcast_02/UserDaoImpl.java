package cn.itcast_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import cn.itcast.pojo.User;
import cn.itcast_01.UserDao;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2018年3月9日 下午8:58:58 
* 类说明 
* 
*/
public class UserDaoImpl implements UserDao {
	private static File file = new File("user.txt");
	static {
		try{
			file.createNewFile();
		}catch(IOException e){
			System.out.println("创建文件失败");
			
			
		}
	}

	@Override
	public boolean isLogin(String username, String password) {
		// TODO Auto-generated method stub
		boolean flag = false;
		BufferedReader br = null;
		try{
			//br = new BufferedReader(new FileReader("user.txt"));
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = br.readLine()) !=null  ){
				//用户名=密码
				String[] datas = line.split("=");
				if(datas[0].equals(username) && datas[1].equals(password)){
					flag = true;
					break;
				}
			}
			
		}catch(FileNotFoundException e){
			System.out.println("用户登录信息找不到信息所在的文件");
		}catch(IOException e){
			System.out.println("用户登录失败");
		}finally{
			if(br != null){
				
				try{
					br.close();
				}catch(IOException e){
					System.out.println("用户登录释放资源失败");
					
				}
			}
		}
		
		return flag;
	}

	@Override
	public void regist(User user)  {
		// TODO Auto-generated method stub
		/*
		 * 为了让注册的数据能够有一定的规则，就定义如下规则
		 * 用户名=密码
		 * 
		 * */
		BufferedWriter bw = null;
		try {
			//bw = new BufferedWriter(new FileWriter("user.txt"));
			bw = new BufferedWriter(new FileWriter(file,true));
			//为了保证数据是追加写入，必须加true

			
			bw.write(user.getUsername()+"="+user.getPassword());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("用户注册失败");
			//e.printStackTrace();
		}finally{
			
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("用户释放资源失败");
				}
			}
		}
		//此处不能抛出异常，首先，这是一个实现类，抽象类没有抛出异常，子类就不能抛
		//然后，如果此处抛出编译类异常，测试类也要做修改
	}

}
