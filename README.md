# LaunchLocalApp
通过手机浏览器启动本地App示例

1 通过手机浏览器启动本地手机App，
2 配置方法
  在要被启动的应用中配置一个隐性Intent，注册要启动的Activity,
   <activity android:name=".LocalAppActivity">

            <intent-filter>

                //添加可浏览的属性
                <category android:name="android.intent.category.BROWSABLE"/>
                <category android:name="android.intent.category.DEFAULT"/>

                //浏览器点击链接之后启动的action
                <action android:name="android.intent.action.VIEW"/>

                //配置data属性,添加scheme协议
                <data android:scheme="app"/>

            </intent-filter>

        </activity>
3 启动方法
  网页中配置：只需要在body体中输入要启动的本地应用对应的<data android:scheme="app"/>即可，hello可以是任意字符
  <body>

    <a href="app://hello">Launch My App</a>
  </body>
