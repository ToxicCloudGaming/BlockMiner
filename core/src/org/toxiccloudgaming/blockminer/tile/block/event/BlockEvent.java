package org.toxiccloudgaming.blockminer.tile.block.event;

import org.toxiccloudgaming.blockminer.tile.block.Block;
import org.toxiccloudgaming.blockminer.world.Chunk;
import org.toxiccloudgaming.blockminer.world.World;

//An event that is created when a Block sends an event to BlockListener.
public class BlockEvent {

    //A BlockEvent's World and position in that World.
    protected World eventWorld;
    protected Chunk eventChunk;
    protected int eventX;
    protected int eventY;

    //The Block that created the Event.
    protected Block eventBlock;

    public BlockEvent(World eventWorld, Block eventBlock) {
        this.eventWorld = eventWorld;
        this.eventBlock = eventBlock;
        this.eventX = eventBlock.getChunkX();
        this.eventY = eventBlock.getChunkY();
        this.eventChunk = eventBlock.getChunk();
    }

}
