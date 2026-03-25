// q1
$(function () {
    console.log('髙橋昂秀');
});
// q2
$(function () {
    $('#btn').on('click', function () {
        $('h1').css('color', 'red');
    });
});
// q3
// $(function () {
//     $('#btn').on('click', function () {
//         let age = $('input').val();
//         alert(age);
//     });
// });
// q4
$(function () {
    $('#btn').on('dblclick', function () {
        $('#btn').prop('disabled', true);
    });
});
