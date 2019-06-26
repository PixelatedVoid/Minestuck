package com.mraof.minestuck.world.gen;

import com.mraof.minestuck.Minestuck;
import net.minecraft.world.gen.ChunkGeneratorType;

public class ModChunkGeneratorType
{
	public static final ChunkGeneratorType<SkaiaGenSettings, ChunkGeneratorSkaia> SKAIA = ChunkGeneratorType.func_212676_a(Minestuck.MOD_ID+":skaia", ChunkGeneratorSkaia::new, SkaiaGenSettings::new, false);
	
}