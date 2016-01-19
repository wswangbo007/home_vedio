/**
 * 新增视频类型
 */

/**当前页面的全局变量*/
var params = {};

$(function(){
	// 初始化页面的对象
	initParams();
	// 隐藏一个tr
	params.hiddenTr.hide();
	// 添加选项
	params.addTrToTable.on('click',addTrToTableFun);
	// 新增按钮
	params.submitBtn.on('click',submitVedioTypeData);
});

/**
 * 添加选项按钮事件
 */
var addTrToTableFun = function() {
	var tempTr = params.hiddenTr;
	params.hiddenTr.remove();
	params.addVedioTable.append(tempTr.html());
	tempTr.show();
}

/**
 * 新增按钮
 */
var submitVedioTypeData = function() {
	var vedioArrays = [];
	$("input[name='vedioName']").each(function(index,item) {
		vedioArrays[index] = $(this).val();
	});
	var vedioTypeValue = vedioArrays.join();
	// TODO 新建一个共用JS,AJAX请求
	postAjax(getRootPath() + "/vedioType/addVedioType",{'vedioTypeValue' : vedioTypeValue},"post","json",function(data){
		console.debug(data);
	});
}

/**
 * 初始化
 */
var initParams = function() {
	params.submitBtn = $("#addVedioBtn");			// 提交按钮
	params.addVedioTable = $("#addVedioTable");		// 要添加的页面
	params.vedioNameArray = $("input[name='vedioName']");		// 视频名称数组
	params.hiddenTr = $("#hiddenTr");				// 隐藏TR
	params.addTrToTable = $("#addTrToTable");
}