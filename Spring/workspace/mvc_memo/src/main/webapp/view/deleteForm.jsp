<%@ page contentType="text/html; charset=UTF-8" %> 
<!DOCTYPE html> 
<html> 
<head>
  <title>homepage</title>
  <meta charset="utf-8">
  <script>
  function update(){
	  let url = "update.do";
	  url += "?memono="+<%= request.getParameter("memono") %>;
	  url += "&col=<%= request.getParameter("col") %>";
	  url += "&word=<<%= request.getParameter("word") %>";
	  url += "&nowPage=<%= request.getParameter("nowPage") %>";
	  
	  location.href = url
  }
  </script>
</head>
<body> 
<div class="container">
<h1 class="col-sm-offset-2 col-sm-10">메모 삭제</h1>
<form class="form-horizontal" 
      action="deleteProc.do"
      method="post"
      >
 <div class="form-group">
 <input type="hidden" name="memono" value="<%= request.getParameter("memono") %>">
  <input type="hidden" name="nowPage" value="<%= request.getParameter("nowPage") %>">
  <input type="hidden" name="col" value="<%= request.getParameter("col") %>">
  <input type="hidden" name="word" value="<%= request.getParameter("word") %>">
  	<label class = "control-label col-sm-2" for="passwd">비밀번호</label>
  	<div class="col-sm-6">
  		<input type="password" name="passwd" id="passwd" class="form-control">
  	</div>
  </div>
   <p id="red" class="col-sm-offset-2 col-sm-6">삭제하면 복구할 수 없습니다</p>
  
   <div class="form-group">
   <div class="col-sm-offset-2 col-sm-5">
    <button class="btn">삭제</button>
    <button type="button" onclick="update()" class="btn">취소</button>
   </div>
 </div>
</form>
</div>
</body> 
</html> 