
function LoginCheck(form) { //防止提交空表单，检查输入是否合法
        if (form.name.value == "") {
            alert("请输入账号");
            return false;
        }
        else if (form.password.value == "") {
            alert("请输入密码");
            return false;
        }
        var reg=/^[0-9]{3,12}$/;
        var f=form.name.value.match(reg);
        if(f==null){
            alert("输入的账号不合法");
            return false;
        }
        return true;
}