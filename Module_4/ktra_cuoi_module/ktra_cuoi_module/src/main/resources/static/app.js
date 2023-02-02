//****
// dùng ajax thì ko thể phân trang
function findByid(){
    let id = $("#idQuestion").val();
    console.log(id);
    $.ajax({
        url:"http://localhost:8080/api/search",
        data:{
            name:id
        },
        type:"get",
        dataType:"json",
        success:function (data) {
            let resutl='';
            for (let i = 0; i <data.length ; i++) {
                resutl += `
               <tr>
                <td>${data[i].id}</td>
                <td>${data[i].questionType.name}</td>
                <td>${data[i].date}</td>
                <td>${data[i].loaiDichVu}</td>
                <td>${data[i].dongia}</td>
                <td>${data[i].dienTich}</td>
                <td>
                    <!-- Button trigger modal -->
                    <a href="/detail/{tenKhachHang}(tenKhachHang=${data[i].id})">Detail</a>
                </td>
                </tr>
                `;
            }
            console.log(resutl);
            $("#result").html(resutl);
            // $("table tr:eq(2)").remove();
        },
        error: function (e) {

        }
    });
}