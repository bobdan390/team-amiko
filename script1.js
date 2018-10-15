$(function(){
	$('.blocks_container a').each(function(){
		var href = $(this).attr('href');
		if (href.match('^#')) {
			$(this).bind('click', function(e){
				e.preventDefault();
				e.stopPropagation();
				
				$('body').scrollTo($($(this).attr('href')), 1000);
			});
		}
	});
});