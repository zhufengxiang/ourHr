var sUserAgent = navigator.userAgent;
var isOpera = sUserAgent.indexOf("Opera") > -1;
var isIE = sUserAgent.indexOf("compatible") > -1 && sUserAgent.indexOf("MSIE") > -1 && !isOpera;

function fAddEvent(oTarget, sType, fHandler, bRemove) {
    if (!oTarget){return false;}
    if (oTarget.addEventListener) {
        bRemove ? oTarget.removeEventListener(sType, fHandler, false) : oTarget.addEventListener(sType, fHandler, false);
    }else if (oTarget.attachEvent) {
        bRemove ? oTarget.detachEvent("on" + sType, fHandler) : oTarget.attachEvent("on" + sType, fHandler);
    }else {
        oTarget["on" +sType] = bRemove ? null : fHandler;
    }
}
//自动设置DIV内容的宽度和高度
function autoSetDiv(contentID,dHeight) { 
    var cWidth = document.body.clientWidth;
    var cHeight = document.body.clientHeight;
    if(cHeight<200) cHeight=200;
    if(cWidth<200) cWidth=200;
    var objContent = document.getElementById(contentID);
    objContent.style.width=cWidth+"px"; 
    objContent.style.height=isIE?(cHeight-parseInt(dHeight)-1+"px"):(cHeight-parseInt(dHeight)-2+"px");
}