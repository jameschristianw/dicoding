package jameschristian.pottato.dev.dota2heroes.data;

import java.util.ArrayList;

import jameschristian.pottato.dev.dota2heroes.R;

public class SkillData {

  public static String[] skillName = {
          "Stifling Dagger",
          "Phantom Strike",
          "Blur",
          "Coup de Grace",

          "Meat Hook",
          "Rot",
          "Flesh Heap",
          "Dismember",

          "Arc Lightning",
          "Lightning Bolt",
          "Static Field",
          "Thundergod's Wrath",

          "Reflection",
          "Conjure Image",
          "Metamorphosis",
          "Sunder",

          "Dragon Slave",
          "Light Strike Array",
          "Fiery Soul",
          "Laguna Blade",

          "Fissure",
          "Enchant Totem",
          "Aftershock",
          "Echo Slam",

          "Fireblast",
          "Ignite",
          "Bloodlust",
          "Multicast",

          "Overwhelming Odds",
          "Press the Attack",
          "Moment of Courage",
          "Duel",

          "Blade Fury",
          "Healing Ward",
          "Blade Dance",
          "Omnislash",

          "Crystal Nova",
          "Frostbite",
          "Arcane Aura",
          "Freezing Field",
  };

  public static String[] skillDesc = {
          "Throws a dagger slowing the enemy unit's movement speed, dealing 65+25% of Phantom Assassin's attack damage as physical damage and applying attack effects from items and abilities.\n",
          "Teleports to a unit, friendly or enemy, and grants bonus attack speed while attacking if it's an enemy unit.\n",
          "Phantom Assassin focuses inward, increasing her ability to evade enemy attacks. Can be activated to blur her body, causing her to be impossible to see until near enemy heroes. Stacks diminishingly with other sources of Evasion.\n",
          "Phantom Assassin refines her combat abilities, gaining a chance of delivering a devastating critical strike to enemy units. Stifling Dagger shares the same critical strike chance.\n",

          "Launches a bloody hook toward a unit or location. The hook will snag the first unit it encounters, dragging the unit back to Pudge and dealing damage if it is an enemy.\n",
          "A toxic cloud that deals intense damage and slows movement--harming not only enemy units but Pudge himself.\n",
          "Gives Pudge increased health regeneration, as well as bonus strength that increases each time Pudge kills an enemy Hero or it dies in his vicinity. Flesh Heap is retroactive, meaning it can gain charges before it is skilled, which then become active.\n",
          "CHANNELED - Pudge chows down on an enemy unit, disabling it and dealing damage over time. Pudge gets healed for the same amount he damages. Lasts longer on creeps.\n",

          "Hurls a bolt of lightning that leaps through nearby enemy units.\n",
          "Calls down a bolt of lightning to strike an enemy unit, causing damage and a mini-stun. When cast, Lightning Bolt briefly provides unobstructed vision and True Sight around the target in a 750 radius. Can be cast on the ground, affecting the closest enemy hero in 325 range.\n",
          "Zeus shocks any enemy hit by his abilities, causing damage proportional to their current health.\n",
          "Strikes all enemy heroes with a bolt of lightning, no matter where they may be. Thundergod's Wrath also provides True Sight around each hero struck. If an enemy hero is invisible, it takes no damage, but the True Sight is still created at that hero's location.\n",

          "Terrorblade brings forth an invulnerable dark reflection of all enemy heroes in a target area. Affected enemy heroes are slowed and attacked by their reflection.\n",
          "Creates an illusion of Terrorblade that deals damage.\n",
          "Terrorblade transforms into a powerful demon with a ranged attack. Any of Terrorblade's illusions that are within 1200 range will also be transformed by Metamorphosis.\n",
          "Severs the life from both Terrorblade and a target hero, exchanging a percentage of both units' current health. Some health points must remain.\n",

          "Lina channels the breath of a dragon, sending out a wave of fire that scorches every enemy in its path.\n",
          "Summons a column of flames that damages and stuns enemies.\n",
          "Grants bonus attack and movement speed each time Lina casts a spell. Stacks with itself. Lasts 10 seconds.\n",
          "Fires off a bolt of lightning at a single enemy unit, dealing massive damage.\n",

          "Slams the ground with a mighty totem, creating an impassable ridge of stone while stunning and damaging enemy units along its line.\n",
          "Empowers Earthshaker's totem, causing it to deal extra damage and have 75 bonus attack range on the next attack.\n",
          "Causes the earth to shake underfoot, adding additional damage and stuns to nearby enemy units when Earthshaker casts his abilities.\n",
          "Shockwaves travel through the ground, damaging enemy units. Each enemy hit causes an echo to damage nearby units. Real heroes cause two echoes.\n",

          "Blasts an enemy unit with a wave of fire, dealing damage and stunning the target.\n",
          "Drenches the target and another random unit in volatile chemicals, causing it to burst into flames. The target is in immense pain, taking damage and moving more slowly.\n",
          "Incites a frenzy in a friendly unit, increasing its movement speed and attack speed. Gives bonus attacks speed if cast on Ogre himself. Can be cast on towers.\n",
          "Enables Ogre Magi to cast his abilities and items multiple times with each use.\n",

          "Turns the enemies' numbers against them, dealing damage and granting you bonus movement speed per unit or per hero. Deals bonus damage to illusions and summoned units as a percent of their current health.\n",
          "Removes debuffs and disables from the target friendly unit, and grants bonus attack speed and health regen for a short time. DISPEL TYPE: Strong Dispel\n",
          "When attacked, Legion Commander has a chance to immediately counterattack with bonus lifesteal.\n",
          "Legion Commander and the target enemy hero are forced to attack each other for a short duration. Neither hero can use items or abilities. If either hero dies during the duration, the hero winning the Duel gains permanent bonus damage.\n",

          "Causes a bladestorm of destructive force around Juggernaut, rendering him immune to magic and dealing damage to nearby enemy units. DISPEL TYPE: Basic Dispel\n",
          "Summons a Healing Ward which heals all nearby allied units, based on their max health. The Healing Ward moves at 350 movement speed after being summoned. Lasts %abilityduration% seconds.\n",
          "Gives Juggernaut a chance to deal critical damage on each attack.\n",
          "Juggernaut leaps towards the target enemy units, and then slashes the target and other nearby enemy units at an increased attack rate. Juggernaut is invulnerable for the duration.\n",

          "A burst of damaging frost slows enemy movement and attack rate in the targeted area.\n",
          "Encases an enemy unit in ice, prohibiting movement and attack, while dealing damage over time. Lasts 10 seconds on creeps level 6 or lower.\n",
          "Gives additional mana regeneration to all friendly units on the map. This bonus is increased for Crystal Maiden.\n",
          "CHANNELED - Surrounds Crystal Maiden with random icy explosions that slow enemies and deal massive damage. Grants bonus armor while channeling. Lasts 10 seconds.\n",
  };

  public static int[] skillImage = {
          R.drawable.phantom_assassin_stifling_dagger,
          R.drawable.phantom_assassin_phantom_strike,
          R.drawable.phantom_assassin_blur,
          R.drawable.phantom_assassin_coup_de_grace,

          R.drawable.pudge_meat_hook_hp1,
          R.drawable.pudge_rot_hp1,
          R.drawable.pudge_flesh_heap_hp1,
          R.drawable.pudge_dismember_hp1,

          R.drawable.zuus_arc_lightning_hp1,
          R.drawable.zuus_lightning_bolt_hp1,
          R.drawable.zuus_static_field_hp1,
          R.drawable.zuus_thundergods_wrath_hp1,

          R.drawable.terrorblade_reflection_hp1,
          R.drawable.terrorblade_conjure_image_hp1,
          R.drawable.terrorblade_metamorphosis_hp1,
          R.drawable.terrorblade_sunder_hp1,

          R.drawable.lina_dragon_slave_hp1,
          R.drawable.lina_light_strike_array_hp1,
          R.drawable.lina_fiery_soul_hp1,
          R.drawable.lina_laguna_blade_hp1,

          R.drawable.earthshaker_fissure_hp1,
          R.drawable.earthshaker_enchant_totem_hp1,
          R.drawable.earthshaker_aftershock_hp1,
          R.drawable.earthshaker_echo_slam_hp1,

          R.drawable.ogre_magi_fireblast_hp1,
          R.drawable.ogre_magi_ignite_hp1,
          R.drawable.ogre_magi_bloodlust_hp1,
          R.drawable.ogre_magi_multicast_hp1,

          R.drawable.legion_commander_overwhelming_odds_hp1,
          R.drawable.legion_commander_press_the_attack_hp1,
          R.drawable.legion_commander_moment_of_courage_hp1,
          R.drawable.legion_commander_duel_hp1,

          R.drawable.juggernaut_blade_fury_hp1,
          R.drawable.juggernaut_healing_ward_hp1,
          R.drawable.juggernaut_blade_dance_hp1,
          R.drawable.juggernaut_omni_slash_hp1,

          R.drawable.crystal_maiden_crystal_nova_hp1,
          R.drawable.crystal_maiden_frostbite_hp1,
          R.drawable.crystal_maiden_brilliance_aura_hp1,
          R.drawable.crystal_maiden_freezing_field_hp1,
  };

  static ArrayList<ArrayList<Skills>> getListData(){
    ArrayList<ArrayList<Skills>> list = new ArrayList<>();
    int counter = 0;

    int photo;
    String name, desc;

    ArrayList<Skills> temp = new ArrayList<>();

    for (int pos = 0; pos < skillName.length; pos++){
      name = skillName[pos];
      desc = skillDesc[pos];
      photo = skillImage[pos];

      Skills skill = new Skills();
      skill.setSkillName(name);
      skill.setSkillDesc(desc);
      skill.setSkillImage(photo);

      temp.add(skill);

      counter++;
      if(counter == 4){
        list.add(temp);
        temp = new ArrayList<>();
        counter = 0;
      }
    }

    return list;
  }
}
