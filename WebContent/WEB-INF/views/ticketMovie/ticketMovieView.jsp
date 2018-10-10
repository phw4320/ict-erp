<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div id="wrapper">
<jsp:include page="/WEB-INF/views/menu/left.jsp" />
	<div id="page-content-wrapper">
	<div class = "container">
		<table class="table table-bordered">
				<tr>
					<td colspan="2"><img src="${tm.tmImg}" width="400"></td>
				</tr>
				<tr>
					<th>번호</th>
					<td>${tm.tmNum}</td>
				</tr>
				<tr>
					<th>영화명</th>
					<td>${tm.tmName}</td>
				</tr>
				<tr>
					<th>표가격</th>
					<td>${tm.tmPrice}</td>
				</tr>
				<tr>
					<th>상영 시작일</th>
					<td>${tm.tmStartDat}</td>
				</tr>
				<tr>
					<th>상영 종료일</th>
					<td>${tm.tmEndDat}</td>
				</tr>
				<tr>
					<th>개봉일</th>
					<td>${tm.tmCredat}</td>
				</tr>
				<tr>
					<th>설명</th>
					<td>${tm.tmDesc}</td>
				</tr>
				<tr>
				<td colspan="2">
					<form action="/ticketMovie/ticketMovieDelete" method="post">
						<button data-page="/ticketMovie/ticketMovieUpdate?tmNum=${tm.tmNum}">수정</button>
						<button>삭제</button>
						<input type="hidden" name="tmNum" value="${tm.tmNum}">
					</form>
				</td>
			</tr>
		</table>
		</div>
	</div>
</div>
<jsp:include page="/WEB-INF/views/menu/bottom.jsp" />