package Exam;

public class ProblemBank {
	Problem a=new Problem("在Java中，负责对字节代码解释执行的是\nA. 应用服务器\nB. 虚拟机\nC. 垃圾回收器\nD. 编译器","b");
	Problem b=new Problem("一个栈的输入序列为1 2 3 4 5，则下列序列中不可能是栈得输出序列的是\nA. 5 4 1 3 2\nB. 2 3 4 1 5\nC. 1 5 4 3 2\nD. 2 3 1 4 5","a");
	Problem c=new Problem("LDAP是什么?\nA. 是一种开源产品\nB. 是一种编程语言\nC. 是一种访问协议\nD. 是一种存储数据的目录","c");
	Problem d=new Problem("要想在你的视图上成功的执行查询需要做什么？\nA. 只能在基础表中有select权限\nB. 在视图中需要有select权限\nC. 基础表中必须有数据\nD. 基础表必须在同一个 用户模式中","b");
	Problem e=new Problem("Oracle中VARCHAR2类型的最大长度是\nA. 4000\nB. 3000\nC. 2000\nD. 1000","a");
	Problem f=new Problem("当客户端关闭一个从连接池中获取的连接, 会发生下面哪一种情况? \nA. 连接不会关闭，只是简单地还给连接池\nB. 连接被关闭，但又被重新打开并还给连接池\nC. 连接永久性关闭\nD. 以上选项都不正确","a");
	Problem g=new Problem("以下哪些不是javascript的全局函数\nA. eval\nB. escape\nC. setTimeout\nD. parseFloat","c");
	Problem h=new Problem("下面有关系统并发访问数估算数据那个最有效\nA. 高峰时段日处理业务量100000\nB. 高峰时段平均每秒请求数80\nC. 同时在线用户数100\nD. 平均每秒用户请求数50","b");
	Problem i=new Problem("以下代码段将创建几个对象？\nString s1=\"bc\";\nString s2=\"bc\";\nA. 2\nB. 3\nC. 0\nD. 1","d");

   Problem PromblemArr[]={a,b,c,d,e,f,g,h,i}; 

}
