document.addEventListener('DOMContentLoaded', function() {
    var link = document.getElementById('link');
    // onClick's logic below:
    link.addEventListener('click', function() {
        makeLoadout();
    });
});

var weapons = new Array("Kraber", "Longbow", "G7 Scout", "Triple Take", "Hemlok", "R-301", "Flatline", "Havoc", "Spitfire", "Devotion", "R-99", "Prowler", "Alternator", "Mastiff", "EVA-8", "Peacekeeper", "Mozambique", "Wingman", "RE-45", "P2020");
var legends = new Array("Bloodhound", "Gibraltar", "Lifeline", "Pathfinder", "Wraith", "Bangalore", "Caustic", "Mirage", "Octane");

function makeLoadout(){
	var randLeg = Math.floor(Math.random()*9);
	var randWep1 = Math.floor(Math.random()*20);
	var randWep2 = Math.floor(Math.random()*20);
	while(randWep1 == randWep2){
		randWep2 = Math.floor(Math.random()*20);
	}
	document.getElementById("output").innerHTML = "You should play " + legends[randLeg] + " and use the " + weapons[randWep1] + " with the " + weapons[randWep2] + " this round";
	document.getElementById("legendPic").src = "imgs/legend_imgs/" + legends[randLeg] + ".png";
	document.getElementById("wepOnePic").src = "imgs/weapon_imgs/" + weapons[randWep1] + ".png";
	document.getElementById("wepTwoPic").src = "imgs/weapon_imgs/" + weapons[randWep2] + ".png";
}
