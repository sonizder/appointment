// function scrollToCustomTarget(targetID) {
//     $('html, body').animate({
//         scrollTop: $(targetID).offset().top
//     }, 1000);
// }

//
// $.fn.scrollToCustomTarget = function(targetID) {
//     $('html, body').animate({
//         scrollTop: $(targetID).offset().top
//     }, 1000);
// }

// <script type="text/javascript">
//     $(document).ready(function(){
//         $("#scrollID").click(function() {
//             $('html, body').animate({
//                 scrollTop: $("#customSroll").offset().top
//             }, 1000);
//         });
//     });
// </script>



// $.fn.scrollToCustomTarget = function() {
//     $('html, body').animate({
//         scrollTop: $('#customSroll').offset().top
//     }, 1000);
// }

$(document).ready(function(){
    $('.scrollToSearch').click(function() {
        $('html, body').animate({
            scrollTop: $('#searchPanel').offset().top -50
        }, 1000);
    });
});