# API-GUI

gui概述

awt 和swing包概述

gui 继承体系图

gui 案例

布局管理器

事件监听机制和适配器模式

常见的组件事件

NetBeans 工具介绍

NetBeans工具使用

### GUI  <Graphical  User Interface>(图形用户接口) 

用图形的方式，来显示计算机操作的界面，这样更方便直观 

###CLI<Command line User interface>(命令行用户接口)

就是常见的DOS命令行操作

需要记忆一些常用的命令，操作不直观，例如创建文件夹或者删除文件夹等

### awt和swing 包的概述

java.awt ：Abstract Window Toolkit(抽象窗口工具包) 需要调用本地系统方法实现功能，属重量级控件（与系统的关联性大）

javax.swing 在awt的基础上，建立的一套图形界面系统，其中提供 了更多的组件，而且完全由java实现，增强了移植性，属于轻量级控件（与系统的关联性小）

## 事件监听机制

​	A 事件源    事件发生的地方

​	B 事件   就是要发生的事情

​	C 事件处理  就是针对发生的事情做出的处理方案

​	D 事件监听 就是把事件源和事件关联起来

### 举例  人受伤

事件源  人（具体的对象）

Person  p1  = new Person("张三");

Person p2 = new Person("李四");

事件：受伤

Interface  受伤接口 {

一拳（）；

一脚（）；

一板砖（）；

}

事件处理：

受伤处理类 Implements 受伤接口{

一拳（）{System.out。println("鼻子流血了，送到是卫生间洗洗")}

一脚（）{              “晕倒了，送到通风处”}

一板砖（）{          “头破血流，送医院”}



}

事件监听

p1.注册监听（受伤接口）

### 菜单组件概述

MenuBar  Menu  Menultem

先创建菜单条，再创建菜单，每一个菜单中建立菜单项

也可以菜单添加到菜单中，作为子菜单

通过setMenuBar（）方法，将菜单添加到Frame 中



