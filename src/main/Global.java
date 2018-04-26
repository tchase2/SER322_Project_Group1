package main;
import entities.*;
import relations.*;
import entityLists.*;
import relationLists.*;

public class Global {
	public static AmmoList ammoList = new AmmoList();
	public static ArmorList armorList = new ArmorList();
	public static BackpackList backpackList = new BackpackList();
	public static BoosterList boosterList = new BoosterList();
	public static ClothingList clothingList = new ClothingList();
	public static HealingItemList healingItemList = new HealingItemList();
	public static ItemList itemList = new ItemList();
	public static MapList mapList = new MapList();
	public static PlayerList playerList = new PlayerList();
	public static SessionList sessionList = new SessionList();
	public static StandardList standardList = new StandardList();
	public static ThrowAbleList throwAbleList = new ThrowAbleList();
	public static VehicleList vehicleList = new VehicleList();
	public static WeaponList weaponList = new WeaponList();
	
	public static HappensOnList happensOnList = new HappensOnList();
	public static HasList hasList = new HasList();
	public static PlaysInList playsInList = new PlaysInList();
	public static SpawnsOnItemList spawnsOnItemList = new SpawnsOnItemList();
	public static SpawnsOnVehicleList spawnsOnVehicleList = new SpawnsOnVehicleList();
	
	public static void init() {
		//Ammo
		ammoList.getList().clear();
		Ammo ammo1 = new Ammo("5.56", "5.56", 100);
		ammoList.getList().add(ammo1);
		Ammo ammo2 = new Ammo("5.56", "5.56", 60);
		ammoList.getList().add(ammo2);
		Ammo ammo3 = new Ammo("7.62", "7.62", 100);
		ammoList.getList().add(ammo3);
		Ammo ammo4 = new Ammo("7.62", "7.62", 60);
		ammoList.getList().add(ammo4);
		Ammo ammo5 = new Ammo("9", "9", 100);
		ammoList.getList().add(ammo5);
		Ammo ammo6 = new Ammo("9", "9", 60);
		ammoList.getList().add(ammo6);
		Ammo ammo7 = new Ammo(".45", ".45", 100);
		ammoList.getList().add(ammo7);
		Ammo ammo8 = new Ammo(".45", ".45", 60);
		ammoList.getList().add(ammo8);
		Ammo ammo9 = new Ammo("12 Gauge", "12 Gauge", 30);
		ammoList.getList().add(ammo9);
		Ammo ammo10 = new Ammo("12 Gauge", "12 Gauge", 15);
		ammoList.getList().add(ammo10);
		Ammo ammo11 = new Ammo("5.56", "5.56", 160);
		ammoList.getList().add(ammo11);
		Ammo ammo12 = new Ammo("7.62", "7.62", 200);
		ammoList.getList().add(ammo12);
		Ammo ammo13 = new Ammo(".45", ".45", 420);
		ammoList.getList().add(ammo13);
		Ammo ammo14 = new Ammo("9", "9", 200);
		ammoList.getList().add(ammo14);
		Ammo ammo15 = new Ammo("12 Gauge", "12 Gauge", 60);
		ammoList.getList().add(ammo15);
		ammoList.exportJSON();
		
		//Armor
		armorList.getList().clear();
		Armor armor1 = new Armor("Motorcycle Helmet", "Head", 80, 80, 1);
		armorList.getList().add(armor1);
		Armor armor2 = new Armor("Military Helmet", "Head", 150, 150, 2);
		armorList.getList().add(armor2);
		Armor armor3 = new Armor("Spetsnaz Helmet", "Head", 230, 230, 3);
		armorList.getList().add(armor3);
		Armor armor4 = new Armor("Police Vest", "Chest", 200, 200, 1);
		armorList.getList().add(armor4);
		Armor armor5 = new Armor("Police Vest", "Chest", 220, 220, 2);
		armorList.getList().add(armor5);
		Armor armor6 = new Armor("Military Vest", "Chest", 250, 250, 3);
		armorList.getList().add(armor6);
		Armor armor7 = new Armor("Motorcycle Helmet", "Head", 80, 15, 1);
		armorList.getList().add(armor7);
		Armor armor8 = new Armor("Military Helmet", "Head", 150, 100, 2);
		armorList.getList().add(armor8);
		Armor armor9 = new Armor("Spetsnaz Helmet", "Head", 230, 50, 3);
		armorList.getList().add(armor9);
		Armor armor10 = new Armor("Police Vest", "Chest", 200, 80, 1);
		armorList.getList().add(armor10);
		Armor armor11 = new Armor("Police Vest", "Chest", 220, 90, 2);
		armorList.getList().add(armor11);
		Armor armor12 = new Armor("Military Vest", "Chest", 250, 200, 3);
		armorList.getList().add(armor12);
		armorList.exportJSON();
		
		//Backpack
		backpackList.getList().clear();
		Backpack backpack1 = new Backpack("Backpack", 150);
		backpackList.getList().add(backpack1);
		Backpack backpack2 = new Backpack("Backpack", 200);
		backpackList.getList().add(backpack2);
		Backpack backpack3 = new Backpack("Backpack", 250);
		backpackList.getList().add(backpack3);
		Backpack backpack4 = new Backpack("Utility Belt", 50);
		backpackList.getList().add(backpack4);
		backpackList.exportJSON();
		
		//Booster
		boosterList.getList().clear();
		Booster booster1 = new Booster("Adrenaline Syringe", 50, 100);
		boosterList.getList().add(booster1);
		Booster booster2 = new Booster("Painkiller", 30, 60);
		boosterList.getList().add(booster2);
		Booster booster3 = new Booster("Energy Drink", 20, 40);
		boosterList.getList().add(booster3);
		boosterList.exportJSON();
		
		//Clothing
		clothingList.getList().clear();
		Clothing clothing1 = new Clothing("Tracksuit Top (Yellow)", "Outer");
		clothingList.getList().add(clothing1);
		Clothing clothing2 = new Clothing("Tracksuit Pants (Yellow)", "Legs");
		clothingList.getList().add(clothing2);
		Clothing clothing3 = new Clothing("Baggy Pants (Black)", "Legs");
		clothingList.getList().add(clothing3);
		Clothing clothing4 = new Clothing("Coat", "Outer");
		clothingList.getList().add(clothing4);
		Clothing clothing5 = new Clothing("Long Sleeved Turtleneck (Black)", "Torso");
		clothingList.getList().add(clothing5);
		Clothing clothing6 = new Clothing("Zest Sunglasses", "Eyes");
		clothingList.getList().add(clothing6);
		Clothing clothing7 = new Clothing("Camo Hotpants", "Legs");
		clothingList.getList().add(clothing7);
		Clothing clothing8 = new Clothing("Punk Knuckle Gloves", "Hands");
		clothingList.getList().add(clothing8);
		Clothing clothing9 = new Clothing("Bloody Sneakers", "Feet");
		clothingList.getList().add(clothing9);
		Clothing clothing10 = new Clothing("Cropped Corset", "Torso");
		clothingList.getList().add(clothing10);
		Clothing clothing11 = new Clothing("Aviator Sunglasses", "Eyes");
		clothingList.getList().add(clothing11);
		Clothing clothing12 = new Clothing("Zest Bootcut Pants", "Legs");
		clothingList.getList().add(clothing12);
		Clothing clothing13 = new Clothing("Camo Cap)", "Head");
		clothingList.getList().add(clothing13);
		Clothing clothing14 = new Clothing("Vintage Gas Mask", "Mask");
		clothingList.getList().add(clothing14);
		Clothing clothing15 = new Clothing("Zest Loafers with Socks", "Feet");
		clothingList.getList().add(clothing15);
		Clothing clothing16 = new Clothing("Military Cap (Black))", "Head");
		clothingList.getList().add(clothing16);
		Clothing clothing17 = new Clothing("Ballistic Mask", "Mask");
		clothingList.getList().add(clothing17);
		Clothing clothing18 = new Clothing("School Shirt with Necktie", "Torso");
		clothingList.getList().add(clothing18);
		Clothing clothing19 = new Clothing("Mini-skirt (Purple)", "Legs");
		clothingList.getList().add(clothing19);
		clothingList.exportJSON();
		
		//Map
		mapList.getList().clear();
		Map map1 = new Map("Erangel", 64);
		mapList.getList().add(map1);
		Map map2 = new Map("Miramar", 64);
		mapList.getList().add(map2);
		Map map3 = new Map("Savage", 16);
		mapList.getList().add(map3);
		mapList.exportJSON();
		
		//Standard
		standardList.getList().clear();
		Standard standard1 = new Standard("Med Kit", 3, 1);
		standardList.getList().add(standard1);
		Standard standard2 = new Standard("Med Kit", 3, 2);
		standardList.getList().add(standard2);
		Standard standard3 = new Standard("First Aid Kit", 2, 3);
		standardList.getList().add(standard3);
		Standard standard4 = new Standard("First Aid Kit", 2, 1);
		standardList.getList().add(standard4);
		Standard standard5 = new Standard("Bandage", 1, 20);
		standardList.getList().add(standard5);
		Standard standard6 = new Standard("Bandage", 1, 10);
		standardList.getList().add(standard6);
		standardList.exportJSON();
		
		//ThrowAble
		throwAbleList.getList().clear();
		ThrowAble throwAble1 = new ThrowAble("Frag Grenade", "Damage", 100, 3);
		throwAbleList.getList().add(throwAble1);
		ThrowAble throwAble2 = new ThrowAble("Frag Grenade", "Damage", 100, 1);
		throwAbleList.getList().add(throwAble2);
		ThrowAble throwAble3 = new ThrowAble("Molotov Cocktail", "Damage", 100, 3);
		throwAbleList.getList().add(throwAble3);
		ThrowAble throwAble4 = new ThrowAble("Molotov Cocktail", "Damage", 100, 2);
		throwAbleList.getList().add(throwAble4);
		ThrowAble throwAble5 = new ThrowAble("Smoke Grenade", "Tactical", 0, 3);
		throwAbleList.getList().add(throwAble5);
		ThrowAble throwAble6 = new ThrowAble("Smoke Grenade", "Tactical", 0, 1);
		throwAbleList.getList().add(throwAble6);
		ThrowAble throwAble7 = new ThrowAble("Stun Grenade", "Tactical", 0, 1);
		throwAbleList.getList().add(throwAble7);
		ThrowAble throwAble8 = new ThrowAble("Stun Grenade", "Tactical", 0, 2);
		throwAbleList.getList().add(throwAble8);
		throwAbleList.exportJSON();
		
		//Vehicle
		vehicleList.getList().clear();
		Vehicle vehicle1 = new Vehicle("UAZ", 4, 100, 120);
		vehicleList.getList().add(vehicle1);
		Vehicle vehicle2 = new Vehicle("UAZ", 4, 50, 120);
		vehicleList.getList().add(vehicle2);
		Vehicle vehicle3 = new Vehicle("Dacia", 4, 100, 100);
		vehicleList.getList().add(vehicle3);
		Vehicle vehicle4 = new Vehicle("Dacia", 4, 75, 100);
		vehicleList.getList().add(vehicle4);
		Vehicle vehicle5 = new Vehicle("Bike", 2, 100, 150);
		vehicleList.getList().add(vehicle5);
		Vehicle vehicle6 = new Vehicle("Bike", 2, 69, 150);
		vehicleList.getList().add(vehicle6);
		Vehicle vehicle7 = new Vehicle("Bus", 6, 100, 50);
		vehicleList.getList().add(vehicle7);
		Vehicle vehicle8 = new Vehicle("Bus", 6, 25, 50);
		vehicleList.getList().add(vehicle8);
		Vehicle vehicle9 = new Vehicle("Truck", 4, 100, 100);
		vehicleList.getList().add(vehicle9);
		Vehicle vehicle10 = new Vehicle("Truck", 4, 40, 100);
		vehicleList.getList().add(vehicle10);
		Vehicle vehicle11 = new Vehicle("Buggy", 2, 100, 100);
		vehicleList.getList().add(vehicle11);
		Vehicle vehicle12 = new Vehicle("Buggy", 2, 70, 100);
		vehicleList.getList().add(vehicle12);
		vehicleList.exportJSON();
		
		//Weapon
		weaponList.getList().clear();
		Weapon weapon1 = new Weapon("M416", "Assault Rifle", 880, 698, 41, 30, 40);
		weaponList.getList().add(weapon1);
		Weapon weapon2 = new Weapon("SCAR-L", "Assault Rifle", 870, 625, 41, 30, 40);
		weaponList.getList().add(weapon2);
		Weapon weapon3 = new Weapon("M16A4", "Assault Rifle", 900, 800, 41, 30, 40);
		weaponList.getList().add(weapon3);
		Weapon weapon4 = new Weapon("GROZA", "Assault Rifle", 715, 750, 48, 30, 40);
		weaponList.getList().add(weapon4);
		Weapon weapon5 = new Weapon("AKM", "Assault Rifle", 715, 600, 48, 30, 40);
		weaponList.getList().add(weapon5);
		Weapon weapon6 = new Weapon("Micro Peen", "Submachine Gun", 350, 1250, 23, 25, 35);
		weaponList.getList().add(weapon6);
		Weapon weapon7 = new Weapon("UMP9", "Submachine Gun", 400, 652, 35, 30, 40);
		weaponList.getList().add(weapon7);
		Weapon weapon8 = new Weapon("Vector", "Submachine Gun", 300, 1090, 31, 13, 25);
		weaponList.getList().add(weapon8);
		Weapon weapon9 = new Weapon("Tommy Gun", "Submachine Gun", 280, 698, 38, 20, 50);
		weaponList.getList().add(weapon9);
		Weapon weapon10 = new Weapon("P18C", "Pistol", 375, 1000, 19, 17, 30);
		weaponList.getList().add(weapon10);
		Weapon weapon11 = new Weapon("P92", "Pistol", 380, 444, 29, 15, 20);
		weaponList.getList().add(weapon11);
		Weapon weapon12 = new Weapon("P1911", "Pistol", 250, 545, 35, 7, 15);
		weaponList.getList().add(weapon12);
		Weapon weapon13 = new Weapon("P1895", "Pistol", 330, 150, 46, 7, 7);
		weaponList.getList().add(weapon13);
		Weapon weapon14 = new Weapon("S696", "Shotgun", 370, 300, 25, 2, 2);
		weaponList.getList().add(weapon14);
		Weapon weapon15 = new Weapon("S1897", "Shotgun", 360, 80, 25, 5, 5);
		weaponList.getList().add(weapon15);
		Weapon weapon16 = new Weapon("S12K", "Shotgun", 350, 240, 22, 5, 10);
		weaponList.getList().add(weapon16);
		Weapon weapon17 = new Weapon("Mini14", "Sniper Rifle", 990, 600, 44, 20, 30);
		weaponList.getList().add(weapon17);
		Weapon weapon18 = new Weapon("SKS", "Sniper Rifle", 800, 666, 55, 10, 20);
		weaponList.getList().add(weapon18);
		Weapon weapon19 = new Weapon("KAR98K", "Sniper Rifle", 760, 32, 72, 5, 5);
		weaponList.getList().add(weapon19);
		Weapon weapon20 = new Weapon("VSS", "Sniper Rifle", 330, 698, 38, 10, 10);
		weaponList.getList().add(weapon20);
		weaponList.exportJSON();
		
		//Session
		sessionList.getList().clear();
		Session session1 = new Session("Game 1", "Server 1", "Squads", 1, 90, 1);
		sessionList.getList().add(session1);
		Session session2 = new Session("Game 2", "Server 2", "Dou", 5, 46, 10);
		sessionList.getList().add(session2);
		Session session3 = new Session("Game 3", "Server 3", "Solo", 10, 3, 30);
		sessionList.getList().add(session3);
		sessionList.exportJSON();
		
		//Player
		playerList.getList().clear();
		Player player1 = new Player("ChinaNumba1", "Male", 100, 0);
		playerList.getList().add(player1);
		Player player2 = new Player("PochinkiIsMyCity", "Female", 20, 50);
		playerList.getList().add(player2);
		Player player3 = new Player("CaoNiMa", "Male", 75, 0);
		playerList.getList().add(player3);
		Player player4 = new Player("Shroud", "Male", 100, 100);
		playerList.getList().add(player4);
		Player player5 = new Player("DrDisrespect", "Male", 100, 50);
		playerList.getList().add(player5);
		Player player6 = new Player("Grill", "Female", 80, 10);
		playerList.getList().add(player6);
		Player player7 = new Player("DontPanMe", "Female", 0, 0);
		playerList.getList().add(player7);
		Player player8 = new Player("CrateChaser420", "Male", 25, 50);
		playerList.getList().add(player8);
		playerList.exportJSON();
		
		
		
		
		
		
		
		
	}
}