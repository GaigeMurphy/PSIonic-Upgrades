package wiresegal.psionup.common.lib

/**
 * @author WireSegal
 * Created at 3:33 PM on 3/26/16.
 */
object LibNames {
    object Items {
        const val LIQUID_INK_COLORIZER = "liquidColorizer"
        const val DRAINED_COLORIZER = "emptyColorizer"
        const val INLINE_CASTER = "fakeCAD"
        const val SPELL_MAGAZINE = "magazine"
        const val WIDE_BAND_SOCKET = "wideSocket"

        const val EBONY_HELMET = "ebonyHelmet"
        const val EBONY_CHEST = "ebonyChestplate"
        const val EBONY_LEGS = "ebonyLeggings"
        const val EBONY_BOOTS = "ebonyBoots"

        const val IVORY_HELMET = "ivoryHelmet"
        const val IVORY_CHEST = "ivoryChestplate"
        const val IVORY_LEGS = "ivoryLeggings"
        const val IVORY_BOOTS = "ivoryBoots"

        const val LIVINGWOOD_CAD = "cadAssemblyBlaster"
        const val LIVINGWOOD_CAD_MODEL = "cadBlaster"
    }

    object Blocks {
        const val CONJURED_PULSAR = "conjuredPulsar"
        const val CONJURED_STAR = "conjuredStar"

        const val BRIGHT_PLATE = "brightPlate"
        const val DARK_PLATE = "darkPlate"

        const val CAD_CASE = "cadCase"
    }

    object Spell {
        const val CONJURE_PULSAR = "conjurePulsar"
        const val CONJURE_PULSAR_SEQUENCE = "conjurePulsarSequence"
        const val CONJURE_PULSAR_LIGHT = "conjurePulsarLight"

        const val PLANAR_NORMAL_VECTOR = "planarNorm"
        const val VECTOR_ROTATE = "vectorRotate"

        const val STRONG_VECTOR_RAYCAST = "strongVectorRaycast"
        const val STRONG_VECTOR_RAYCAST_AXIS = "strongVectorRaycastAxis"

        const val VECTOR_FALLBACK = "vectorFallback"

        const val PARTICLE_TRAIL = "particleTrail"

        const val CONJURE_CRACKLE = "conjureCrackle"


        const val MAKE_BURST = "makeManaBurst"
        const val WILD_DRUM = "drumOfTheWild"
        const val CANOPY_DRUM = "drumOfTheCanopy"
        const val GATHERING_DRUM = "drumOfTheGathering"
    }

    object PieceGroups {
        const val ALTERNATE_CONJURATION = "${LibMisc.MOD_ID}.redstoneConjuration"
        const val SECONDARY_VECTOR_OPERATORS = "${LibMisc.MOD_ID}.secondaryVectors"

        const val MANA_PSIONICS = "${LibMisc.MOD_ID}.manaPsionics"
    }

    val Colors = arrayOf("White",     "Orange", "Magenta", "LightBlue",
                         "Yellow",    "Lime",   "Pink",    "Gray",
                         "LightGray", "Cyan",   "Purple",  "Blue",
                         "Brown",     "Green",  "Red",     "Black")
}
