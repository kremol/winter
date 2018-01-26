Tomcat
想安全，放WEB-INF 目录中





Servlet
- 由我们写但不由我们(由服务器)创建对象，不由我们调用方法

-单例，一个类只有一个对象
 线程不安全，所以效率高 

- 让浏览器访问servlet：
1、给servlet指定一个路径
2、浏览器访问servlet路径 (web.xml中对servlet进行配置)
<servlet>
        <servlet-name>xxx</servlet-name>	#自己起的随便名字
		
        <servlet-class>mkl.FirstServlet</servlet-class>	#类名(带包名)
		
</servlet>
    
<servlet-mapping>
        <servlet-name>xxx</servlet-name>
        <url-pattern>/H</url-pattern>	#路径，可以设置多个url-pattern
</servlet-mapping>



- servletConfig 的两个方法来获取初始化参数，但要先在web.xml中配置

 web.xml:
 <init-param>
            <param-name>p1</param-name>
            <param-value>v1</param-value>
        </init-param>
        <init-param>
            <param-name>p2</param-name>
            <param-value>v2</param-value>
        </init-param>      



init():		
		servletConfig.getInitParameter("p1");
        servletConfig.getInitParameter("p2")；

        Enumeration e = servletConfig.getInitParameterNames();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
		
		
		

conf下的web.xml
它相当于每个web app中的web.xml中都写了conf下的web.xml的内容
		
		
		
		
ServeletContext
- 一个项目只有一个ServeletContext对象！
- 我们可以在N多个Servlet中获取这个唯一的对象，使用它给多个Servlet传递数据
- 可以由 ServeletConfig 得到(很多都有)

- 是域对象，可以用来
		存储数据
		获取应用初始化参数
		获取资源相关方法(比如真实路径名)
		
		



Request、Response		
- 都是服务器做的，请求数据被装在request，响应装在response
		