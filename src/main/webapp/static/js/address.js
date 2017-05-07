function getTown() {

    var selectedCity = $("#city").val();

    if(!selectedCity){
        clearAddressValues("#townList");
        return;
    }

    $.ajax({
        type : "GET",
        contentType : "application/json",
        url: 'address/town',
        data: ({city : selectedCity}),
        dataType : 'json',
        timeout : 10000,
        success : function(town) {
            updateAddressData("#townList", town)
            console.log("SUCCESS: ", town);
        },
        error : function(e) {
            console.log("ERROR: ", e);
        },
        done : function(e) {
            console.log("DONE");
        }
    });

}

function getDistrict() {

    var selectedCity = $("#city").val();
    var selectedTown = $("#town").val();

    if(!selectedTown){
        clearAddressValues("#districtList");
        return;
    }

    $.ajax({
        type : "GET",
        contentType : "application/json",
        url: 'address/district',
        data: ( {city : selectedCity, town : selectedTown}),
        dataType : 'json',
        timeout : 10000,
        success : function(district) {
            updateAddressData("#districtList", district);
            console.log("SUCCESS: ", district);
        },
        error : function(e) {
            alert("ERROR: " +  e);
        }
    });

}

function updateAddressData(id, data){
    clearAddressValues(id);
    $.each(data, function(i, value) {
        $(id).append($('<option>').text(value).attr('value', value));
    });
}

function clearAddressValues(id) {
    if(id == "#townList"){
        $('#townList').empty();
        $('#town').val('');
        $('#districtList').empty();
        $('#district').val('');
    }else if(id == "#districtList"){
        $('#districtList').empty();
        $('#district').val('');
    }
}