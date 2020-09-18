<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <title>账号列表</title>
    <%@ include file="/jsp/manager/common/head-meta.jsp"%>
    <%@ include file="/jsp/manager/common/js-meta.jsp"%>
</head>
<body>
<div class="col_main">
    <div class = "condQueryDiv">
        <form id = "condForm">
            <div class = "condQueryCtrl">
                <div class = "condQueryLabelDiv">银行名称	：</div>
                <div class="formCtrlDiv">
                    <input type ="text" class ="inputCommonSty" id="bankName" name ="bankName">
                </div>
                <div class = "condQueryLabelDiv">银行卡号：</div>
                <div class="formCtrlDiv">
                    <input type ="text" class ="inputCommonSty" id="bankCard" name ="bankCard">
                </div>
                <div class = "condQueryLabelDiv">开户人：</div>
                <div class="formCtrlDiv">
                    <input type ="text" class ="inputCommonSty" id="accountName" name ="accountName">
                </div>

                <div class = "condQueryLabelDiv">大于金额：</div>
                <div class="formCtrlDiv">
                    <input type ="text" class ="inputCommonSty" id="money" name ="money">
                </div>

                <div class = "condQueryLabelDiv">卡商：</div>
                <div class="formCtrlDiv">
                    <div id="divAccount">

                    </div>
                    <%--<input type ="text" class ="inputCommonSty" id="accountIdName" name ="accountIdName">--%>
                </div>

                <div class = "condQueryLabelDiv">卡站点：</div>
                <div class="formCtrlDiv">
                    <div id="divCardSite">

                    </div>
                    <%--<input type ="text" class ="inputCommonSty" id="cardSiteIdName" name ="cardSiteIdName">--%>
                </div>

                <div class="searchdiv">
                    <input type = "button" id = "btnQuery" class = "buttonClass imginput" value = "搜索" />
                </div>
                <div class="searchdiv">
                    <input type = "button" id = "butReset" class = "buttonClass imginput" value = "重置" />
                </div>

                <%--<c:if test="${ACCOUNT.roleId==1}">--%>
                    <%--<div class = "searchdiv">--%>
                        <%--<input type="button" class = "buttonClass imginput addbtn" value="新增账号" style="margin-left: 30px;" >--%>
                    <%--</div>--%>
                <%--</c:if>--%>
            </div>
        </form>

    </div>

    <table class="datatable tables">
        <thead>
        <tr>
            <th width="150">银行ID</th>
            <th width="150">银行名称</th>
            <th width="150">银行卡号</th>
            <th width="150">开户人</th>
            <th width="150">成功金额</th>
            <th width="150">卡商</th>
            <th width="150">卡站点</th>
            <th width="150">时间</th>
            <%--<th width="380">操作</th>--%>
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
</div>
<script type='text/javascript' charset="utf-8" src='${ctxData}js/common/common2.js'></script>
<script type='text/javascript' charset="utf-8" src='${ctxData}js/manager/bankcollection/bankcollection.js'>
</script>
</body>
</html>
