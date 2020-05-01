
$('#toRegister').click(function () {
  $('#loginForm').hide();
  $('#registerForm').addClass('active')
  $('#registerForm').show();
})

$('#reLogin').click(function () {
  $('#loginForm').addClass('active');
  $('#loginForm').show();
  $('#registerForm').hide();
})

$('#login').click(function () {
  $('#loginForm').validate()
})
$('#register').click(function () {
  $('#registerForm').validate()
})

$("#loginForm").validate({
  errorPlacement: function (error, element) {
    // Append error within linked label
    $(element).closest("form").find("label[for='" + element.attr("name") + "']").append(error);
  },
  errorElement: "span",
  rules: {
    username: {
      required: true,
      minlength: 2
    },
    password: {
      required: true,
      minlength: 6
    }
  },
  messages: {
    username: {
      required: "(请输入用户名)",
      minlength: "(用户名必需由两个字母组成)"
    },
    password: {
      required: "(请输入密码)",
      minlength: "(密码长度不能小于 6 个字母)"
    }
  },
  submitHandler:function(form) {
    // $(form).ajaxSubmit();
  }
});
$("#registerForm").validate({
  errorPlacement: function (error, element) {
    // Append error within linked label
    $(element).closest("form").find("label[for='" + element.attr("name") + "']").append(error);
  },
  errorElement: "span",
  rules: {
    username: {
      required: true,
      minlength: 2
    },
    password: {
      required: true,
      minlength: 6
    },
    confirmPass: {
      required: true,
      minlength: 6,
      equalTo: "#password"
    },
    phone: {
      required: true
    },
    birthday: {
      required: true
    }
  },
  messages: {
    username: {
      required: "(请输入用户名)",
      minlength: "(用户名必需由两个字母组成)"
    },
    password: {
      required: "(请输入密码)",
      minlength: "(密码长度不能小于 6 个字母)"
    },
    confirmPass: {
      required: "(请输入确认密码)",
      minlength: "(密码长度不能小于 6 个字母)",
      equalTo: "请检查两侧密码是否一致"
    },
    phone: {
      required: "(请输入电话)"
    },
    birthday: {
      required: "(请选择生日)"
    }
  },
  submitHandler:function(form) {
    // $(form).ajaxSubmit();
  }
})