CREATE TABLE IF NOT EXISTS `character` (
  `character_id` int(12) NOT NULL,
  `account_id` varchar(50) NOT NULL,
  `clan_id` int(10) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `race` enum('HUMAN','ELF','DARK_ELF','ORC','DWARF','KAMAEL') NOT NULL,
  `class` enum('HUMAN_FIGHTER','WARRIOR','GLADIATOR','WARLORD','KNIGHT','PALADIN','DARK_AVENGER','ROGUE','TREASURE_HUNTER','HAWKEYE','DUELIST','DREADNOUGHT','phoenixKnight','hellKnight','sagittarius','adventurer','HUMAN_MYSTIC','WIZARD','SORCEROR','NECROMANCER','WARLOCK','CLERIC','BISHOP','PROPHET','ARCHMAGE','SOULTAKER','ARCANA_LORD','CARDINAL','HIEROPHANT','ELVEN_FIGHTER','ELVEN_KNIGHT','TEMPLE_KNIGHT','SWORD_SINGER','ELVEN_SCOUT','PLAINS_WALKER','SILVER_RANGER','EVA_TEMPLAR','SWORD_MUSE','WIND_RIDER','MOONLIGHT_SENTINEL','ELVEN_MYSTIC','ELVEN_WIZARD','SPELLSINGER','ELEMENTAL_SUMMONER','ORACLE','ELDER','MYSTIC_MUSE','ELEMENTAL_MASTER','EVA_SAINT','DARK_FIGHTER','PALUS_KNIGHT','SHILLIEN_KNIGHT','BLADEDANCER','ASSASSIN','ABYSS_WALKER','PHANTOM_RANGER','SHILLIEN_TEMPLAR','spectralDancer','ghostHunter','ghostSentinel','DARK_MYSTIC','DARK_WIZARD','SPELLHOWLER','PHANTOM_SUMMONER','SHILLIEN_ORACLE','SHILLIEN_ELDER','STORM_SCREAMER','SPECTRAL_MASTER','SHILLIEAN_SAINT','ORC_FIGHTER','ORC_RAIDER','DESTROYER','ORC_MONK','TYRANT','TITAN','GRAND_KHAUATARI','ORC_MYSTIC','ORC_SHAMAN','OVERLORD','WARCRYER','DOMINATOR','DOOMCRYER','DWARVEN_FIGHTER','SCAVENGER','BOUNTY_HUNTER','ARTISAN','WARSMITH','FORTUNE_SEEKER','MAESTRO','MALE_SOLDIER','TROOPER','BERSEKER','MALE_SOULBREAKER','DOOMBRINGER','MALE_SOULDHOUND','FEMALE_SOLDIER','WARDER','FEMALE_SOULBREAKER','ARBALESTER','FEMALE_SOULDHOUND','TRICKSTER','INSPECTOR','JUDICATOR') NOT NULL DEFAULT 'HUMAN_FIGHTER',
  `sex` enum('MALE','FEMALE') NOT NULL,
  `level` int(3) NOT NULL,
  `experience` int(15) NOT NULL,
  `sp` int(15) NOT NULL,
  `point_x` int(10) NOT NULL,
  `point_y` int(10) NOT NULL,
  `point_z` int(10) NOT NULL,
  `point_angle` double NOT NULL,
  `appearance_hair_style` enum('STYLE_A','STYLE_B','STYLE_C','STYLE_D','STYLE_E') NOT NULL DEFAULT 'STYLE_A',
  `appearance_hair_color` enum('COLOR_A','COLOR_B','COLOR_C','COLOR_D') NOT NULL DEFAULT 'COLOR_A',
  `apperance_face` enum('FACE_A','FACE_B','FACE_C') NOT NULL DEFAULT 'FACE_A',
  PRIMARY KEY (`character_id`),
  KEY `account_id` (`account_id`),
  KEY `name` (`name`),
  KEY `clan_id` (`clan_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Temporary sample data
--

INSERT INTO `character` (`character_id`, `account_id`, `clan_id`, `name`, `race`, `class`, `sex`, `level`, `experience`, `sp`, `point_x`, `point_y`, `point_z`, `point_angle`, `appearance_hair_style`, `appearance_hair_color`, `apperance_face`) VALUES
(268437456, 'rogiel', NULL, 'Rogiel', 'HUMAN', 'HUMAN_FIGHTER', 'MALE', 1, 0, 0, -71338, 258271, -3104, 0, 'STYLE_B', 'COLOR_B', 'FACE_B'),
(268437457, 'rogiel2', NULL, 'Rogiel2', 'HUMAN', 'HUMAN_FIGHTER', 'MALE', 0, 0, 0, 0, 0, 0, 0, 'STYLE_A', 'COLOR_A', 'FACE_A');
