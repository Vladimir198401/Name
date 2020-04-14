	function miestaiCrud(){
		var dialog, form;
	
			id_miestai = $("#id" );
			pav_miestai = $("#pav" );
			kodas_salies = $("#kodas_salies");
			apras_miestai = $("#apras" );
			
			allFields = $( [] )
			.add( id_miestai )
			.add( pav_miestai )
			.add( kodas_salies )
			.add( apras_miestai );

		pasiimtiMiestai();
		
		dialog = $( "#dialog-form" ).dialog({
			autoOpen: false,
			height: "auto",
			width: 350,
			modal: true,
			buttons: {
				"Sukurti": function(){
					addMiestas();
				},
				"Atsaukti": function() {
					$(this).dialog( "close" );
				}
			},
			close: function() {
				form[ 0 ].reset();
				allFields.removeClass( "ui-state-error" );
			}
		});
		trintidialog = $( "#dialog-confirm" ).dialog({
			autoOpen: false,
			resizable: false,
			height: "auto",
			width: 400,
			modal: true,
			buttons: {
				"Istrinti irasa": function() {
					$.ajax('/ajax/salinti-miestas?' + params_str)
					.done( function( data ) {
						trintidialog.dialog( "close" );
						pasiimtiMiestai();
					});
				},
				"Atsaukti": function() {
					$(this).dialog( "close" );
				}
			},
			close: function() {
				form[ 0 ].reset();
				allFields.removeClass( "ui-state-error" );
			}
		});
		form = dialog.find( 'form' ).on ("submit", function(event){
			event.preventDefault();
			addMiestas();
		});
		
		function keistiBusena( id, busena) {
			params_str = 'id=' + id; 
			if (busena == 'trinti'){
				$('#pav_miestai').val(pav);
				trintidialog.dialog( "open" );
			}
			if (busena == 'redaguoti'){
			
				$('#pav_veiksmo' ).html ( 'Redaguojamas irasas' );
				$('#id').val(id);
				$('#pav' ).val(pav);
				$('#kodas_salies').val(kodas_salies);
				$('#apras' ).val(apras);
				dialog.dialog( "open" );
			}
		}
		
		function pasiimtiMiestai() {
			
			$.ajax( '/ajax/lst-miestai').done(function( data ) {
						
						res_str = '<table>'
								+ '<tr>'
									+ '<th>Id</th>'
									+ '<th>Pavadinimas</th>'
									+ '<th>Kodas_salies</th>'
									+ '<th>Aprasas</th>'
									+ '<th>Veiksmai</th>'
								+ '</tr>';
								
						for ( i = 0; i < data.length; i++) {
									
							res_str += '<tr data-id="' + data [ i ].id  
							
							+ '" data-pav="' + data [ i ].pav 
							+ '" data-kodas_salies="' + data [ i ].kodas_salies 
							+ '" data-apras="' + data [ i ].apras 
							+ '">'
					 
							+ '<td>' + data [ i ].id + '</td>' 
							+ '<td>' + data [ i ].pav + '</td>'
							+ '<td>' + data [ i ].kodas_salies + '</td>'
							+ '<td>' + data [ i ].apras + '</td>'
							
						 
							+ '<td><input type="button" class="trinti" value="trinti">'
							+ '<input type="button" class="redaguoti" value="redaguoti"></td>'
							;

							res_str += '</tr>';
						}
						
						res_str += '</table>'
						$( '#miestai' ).html ( res_str );
						$( "#create-miestas" ).button().on( "click", function() {
							$( '#pav_veiksmo' ).html ( 'Kuriamas naujas irasas' );
							$( '#id' ).val ( '0' );
							dialog.dialog( "open" );
						});
						
						$( '.trinti' ).on ( 'click', function() {
						
							$( this ).each ( function() {
								
								id = $( this ).parent( ).parent().data ( 'id' );

								keistiBusena ( id, 'trinti' );
							});
						});
						
						$( '.redaguoti' ).on ( 'click', function() {
						
							$( this ).each ( function() {
								
								id = $( this ).parent( ).parent().data ( 'id' );
								pav = $( this ).parent().parent().data ('pav');
								kodas_salies = $( this ).parent().parent().data ('kodas_salies');
								apras = $( this ).parent().parent().data ('apras');

								keistiBusena ( id, 'redaguoti' );
							});
						});
					});		
				}
		
		function addMiestas() {
		
			naujas_miestas = {
				id: $('#id').val()
				, pav: $( '#pav' ).val()
				, kodas_salies: $('#kodas_salies').val()
				, apras:  $( '#apras' ).val() 
				
			}
			
			params_str = 
				"id=" + naujas_miestas.id
				+ "&pav="  + naujas_miestas.pav
				+ "&kodas_salies=" + naujas_miestas.kodas_salies
				+ "&apras=" + naujas_miestas.apras
	
				
			alert ( "/ajax/saugoti-miestas?" + params_str );
				
			$.ajax(
				 "/ajax/saugoti-miestas?" + params_str
				)

			.done( function( data ) {
				
				dialog.dialog ("close");
				pasiimtiMiestai();
				
			});
		}
	}