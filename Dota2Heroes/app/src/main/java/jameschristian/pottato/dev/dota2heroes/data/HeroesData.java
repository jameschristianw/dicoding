package jameschristian.pottato.dev.dota2heroes.data;

import java.util.ArrayList;

import jameschristian.pottato.dev.dota2heroes.R;

public class HeroesData {
  private static String[] heroName = {
      "Phantom Assassin",
      "Pudge",
      "Zeus",
      "Terrorblade",
      "Lina",
      "Earthshaker",
      "Ogre Magi",
      "Legion Commander",
      "Juggernaut",
      "Crystal Maiden",
  };

  private static int[] heroPhoto = {
          R.drawable.phantom_assassin_full,
          R.drawable.pudge_full,
          R.drawable.zuus_full,
          R.drawable.terrorblade_full,
          R.drawable.lina_full,
          R.drawable.earthshaker_full,
          R.drawable.ogre_magi_full,
          R.drawable.legion_commander_full,
          R.drawable.juggernaut_full,
          R.drawable.crystal_maiden_full
  };

  private static String[] heroDetail = {
      "Through a process of divination, children are selected for upbringing by the Sisters of the Veil, an order that considers assassination a sacred part of the natural order. The Veiled Sisters identify targets through meditation and oracular utterances. They accept no contracts, and never seem to pursue targets for political or mercenary reasons. Their killings bear no relation to any recognizable agenda, and can seem to be completely random: A figure of great power is no more likely to be eliminated than a peasant or a well digger. Whatever pattern the killings may contain, it is known only to them. They treat their victims as sacrifices, and death at their hand is considered an honor. Raised with no identity except that of their order, any Phantom Assassin can take the place of any other; their number is not known. Perhaps there are many, perhaps there are few. Nothing is known of what lies under the Phantom Veil. Except that this one, from time to time, when none are near enough to hear, is known to stir her veils with the forbidden whisper of her own name: Mortred.",
      "In the Fields of Endless Carnage, far to the south of Quoidge, a corpulent figure works tirelessly through the night--dismembering, disembowelling, piling up the limbs and viscera of the fallen that the battlefield might be clear by dawn. In this cursed realm, nothing can decay or decompose; no corpse may ever return to the earth from which it sprang, no matter how deep you dig the grave. Flocked by carrion birds who need him to cut their meals into beak-sized chunks, Pudge the Butcher hones his skills with blades that grow sharper the longer he uses them. Swish, swish, thunk. Flesh falls from the bone; tendons and ligaments part like wet paper. And while he always had a taste for the butchery, over the ages, Pudge has developed a taste for its byproduct as well. Starting with a gobbet of muscle here, a sip of blood there...before long he was thrusting his jaws deep into the toughest of torsos, like a dog gnawing at rags. Even those who are beyond fearing the Reaper, fear the Butcher.",
      "Lord of Heaven, father of gods, Zeus treats all the Heroes as if they are his rambunctious, rebellious children. After being caught unnumbered times in the midst of trysts with countless mortal women, his divine wife finally gave him an ultimatum: 'If you love mortals so much, go and become one. If you can prove yourself faithful, then return to me as my immortal husband. Otherwise, go and die among your creatures.' Zeus found her logic (and her magic) irrefutable, and agreed to her plan. He has been on his best behavior ever since, being somewhat fonder of immortality than he is of mortals. But to prove himself worthy of his eternal spouse, he must continue to pursue victory on the field of battle.",
      "Terrorblade is the demon marauder--an outlaw hellion whom even other demons fear. A cosmic iconoclast, he stole from the Demon Lords, ignored the codified rites that should have bound his behavior, and broke every law of the seven Infernal Regions. For his crimes, he was taught this lesson: even Hell has a hell. A short, brutal trial ensued, with many dead on all sides, and he was finally incarcerated in Foulfell, a hidden dimension where demonkind imprison their own.\n" +
          "\n" +
          "But Foulfell is no normal prison. In this dark mirror of reality, demons are sentenced to gaze eternally into the twisted reflection of their own souls. But instead of suffering, Terrorblade made himself master of his own reflected worst self--a raging, thieving demon of unimaginable power. With his inner beast under sway, he destroyed the fractal prison walls and burst free to turn his terror loose upon all creation.",
      "The sibling rivalries between Lina the Slayer, and her younger sister Rylai, the Crystal Maiden, were the stuff of legend in the temperate region where they spent their quarrelsome childhoods together. Lina always had the advantage, however, for while Crystal was guileless and naive, Lina's fiery ardor was tempered by cleverness and conniving. The exasperated parents of these incompatible offspring went through half a dozen homesteads, losing one to fire, the next to ice, before they realized life would be simpler if the children were separated. As the oldest, Lina was sent far south to live with a patient aunt in the blazing Desert of Misrule, a climate that proved more than comfortable for the fiery Slayer. Her arrival made quite an impression on the somnolent locals, and more than one would-be suitor scorched his fingers or went away with singed eyebrows, his advances spurned. Lina is proud and confident, and nothing can dampen her flame.",
      "Like a golem or gargoyle, Earthshaker was one with the earth but now walks freely upon it. Unlike those other entities, he created himself through an act of will, and serves no other master. In restless slumbers, encased in a deep seam of stone, he became aware of the life drifting freely above him. He grew curious. During a season of tremors, the peaks of Nishai shook themselves loose of avalanches, shifting the course of rivers and turning shallow valleys into bottomless chasms. When the land finally ceased quaking, Earthshaker stepped from the settling dust, tossing aside massive boulders as if throwing off a light blanket. He had shaped himself in the image of a mortal beast, and named himself Raigor Stonehoof. He bleeds now, and breathes, and therefore he can die. But his spirit is still that of the earth; he carries its power in the magical totem that never leaves him. And on the day he returns to dust, the earth will greet him as a prodigal son.",
      "The ordinary ogre is the creature for whom the phrase 'As dumb as a bag of rock hammers' was coined. In his natural state, an ogre is supremely incapable of doing or deciding anything. Clothed in dirt, he sometimes finds himself accidentally draped in animal skins after eating lanekill. Not an especially social creature, he is most often found affectionately consorting with the boulders or tree-stumps he has mistaken for kin (a factor that may explain the ogre's low rate of reproduction). However, once every generation or so, the ogre race is blessed with the birth of a two-headed Ogre Magi, who is immediately given the traditional name of Aggron Stonebreak, the name of the first and perhaps only wise ogre in their line's history. With two heads, Ogre Magi finds it possible to function at a level most other creatures manage with one. And while the Ogre Magi will win no debates (even with itself), it is graced with a divine quality known as Dumb Luck--a propensity for serendipitous strokes of fortune which have allowed the ogre race to flourish in spite of enemies, harsh weather, and an inability to feed itself. It's as if the Goddess of Luck, filled with pity for the sadly inept species, has taken Ogre Magi under her wing. And who could blame her? Poor things.",
      "They came without warning. Within the city walls of Stonehall there came a rumble and a terrible sound, and from blackness unknown came a force of beasts numbering beyond count, wielding flame and foul sorcery, slaying and snatching mothers and sons to dark purpose. Of once-mighty Stonehall's military strength only the Bronze Legion, led by the indomitable Commander Tresdin, was near enough to answer the call of battle. They rode into their city, fighting through bloodstained alleyways and burning markets, cutting their way through the monstrous throng to the source of the sudden invasion: an ethereal rift within the city square, and at its precipice thundered their dreaded champion.\n" +
          "\n" +
          "Enwrapped in a corrosive shimmer, the leader of the abyssal horde swung its massive blade, cleaving a legionnaire in two as his flesh began to spoil. Tresdin lifted her blood-stained sword and settled her sights on the beast. It turned, smiling at her through a maze of teeth. Heedless of the battle raging around them, they charged one another.\n" +
          "\n" +
          "Deflecting blow after blow, the pair danced their deadly duel as the Bronze Legion met its end around them. Tresdin leapt forward as her foe swung its sword to meet her. The odds turned. The attack smashed into Tresdin suddenly, a brutal thrust from the side, but even as her balance slipped she rallied her strength for another stroke. Blade scraped on blade, beyond the hilt to the gnarled paw below, carving it in two in a fearsome spray of sparks and blood. The vile audience looked on in astonishment as she pressed the attack, driving her blade through her foe's flesh into the stampeding heart within. With a scream that split the clouds above, the beast erupted in a torrent of gore and anguish. The stygian portal wavered, the power sustaining the chasm beyond vanishing as suddenly as it had appeared. The remaining invaders fell quickly to Stonehall steel.\n" +
          "\n" +
          "Though victorious, the survivors saw little to celebrate: the city lay in ruins, and survivors were few. Fires continued to spread. Unfurling her banners of war, Tresdin gathered what allies she could. Her anger smoldered as she pledged brutal vengeance upon the forces of the abyss, and damned be any who would dare stand in her way.",
      "No one has ever seen the face hidden beneath the mask of Yurnero the Juggernaut. It is only speculation that he even has one. For defying a corrupt lord, Yurnero was exiled from the ancient Isle of Masks--a punishment that saved his life. The isle soon after vanished beneath the waves in a night of vengeful magic. He alone remains to carry on the Isle's long Juggernaut tradition, one of ritual and swordplay. The last practitioner of the art, Yurnero's confidence and courage are the result of endless practice; his inventive bladework proves that he has never stopped challenging himself. Still, his motives are as unreadable as his expression. For a hero who has lost everything twice over, he fights as if victory is a foregone conclusion.",
      "Born in a temperate realm, raised with her fiery older sister Lina, Rylai the Crystal Maiden soon found that her innate elemental affinity to ice created trouble for all those around her. Wellsprings and mountain rivers froze in moments if she stopped to rest nearby; ripening crops were bitten by frost, and fruiting orchards turned to mazes of ice and came crashing down, spoiled. When their exasperated parents packed Lina off to the equator, Rylai found herself banished to the cold northern realm of Icewrack, where she was taken in by an Ice Wizard who had carved himself a hermitage at the crown of the Blueheart Glacier. After long study, the wizard pronounced her ready for solitary practice and left her to take his place, descending into the glacier to hibernate for a thousand years. Her mastery of the Frozen Arts has only deepened since that time, and now her skills are unmatched.",
  };

  public static ArrayList<Hero> getListData(){
    ArrayList<Hero> list = new ArrayList<>();
    ArrayList<ArrayList<Skills>> listSkill = SkillData.getListData();

    for (int pos = 0; pos < heroName.length; pos++){
      Hero hero = new Hero();
      hero.setName(heroName[pos]);
      hero.setBiography(heroDetail[pos]);
      hero.setPhoto(heroPhoto[pos]);
      hero.setSkills(listSkill.get(pos));

      list.add(hero);
    }

    return list;
  }

  public static Hero getSpecificHero(String heroNameSearch){
    ArrayList<ArrayList<Skills>> listSkill = SkillData.getListData();
    for (int pos = 0; pos < heroName.length; pos++){
      Hero hero = new Hero();
      hero.setName(heroName[pos]);
      hero.setBiography(heroDetail[pos]);
      hero.setPhoto(heroPhoto[pos]);
      hero.setSkills(listSkill.get(pos));

      if (heroNameSearch.equalsIgnoreCase(heroName[pos])) return hero;
    }
    return null;
  }
}