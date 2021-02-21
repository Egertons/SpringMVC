<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.5.3/css/bootstrap.css" rel="stylesheet">
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <style type="text/css">
      #a{
        left: 0;
        right: 0;
        position: absolute;
        margin: auto;
      }
      #a a{
        text-decoration: none;
        color: azure;
        font-weight: bolder;
      }
      #b{
        left: 0;
        right: 0;
        position: absolute;
        margin: auto;
      }
      #c{
        margin-top: 50px;
      }
    </style>
    <script type="text/javascript">
      function go() {
        $.ajax({
          url:"${pageContext.request.contextPath}/ajax",
          data:{"name":$("#username").val()},
          success:function (kkk){
            alert(kkk);
          }
        })
      }
    </script>
  </head>
  <body>
    <div class="container-fluid">
      <div class="row" id="c">
        <div class="col-md">
          <button class="btn btn-success" id="a">
            <a href="${pageContext.request.contextPath}/a">测试</a>
          </button>
        </div>
        <div class="col-md">
          <div id="b">
            Ajax测试:
            <input type="text" id="username" onblur="go()">
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
