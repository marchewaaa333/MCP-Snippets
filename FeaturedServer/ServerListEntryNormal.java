...
          boolean isFeatured = (field_148301_e instanceof ServerDataFeatured);
        if(isFeatured) {
        	if(field_148301_e.serverIP.equals("IpOfMoreFeaturedServer")) {
        		drawImg(x, y, true, ServerDataFeatured.STAR, true);
        	}else {
        		drawImg(x, y, true, ServerDataFeatured.STAR, false);
        	}
        	
        }
...
...
    private void drawImg(int x, int y, boolean lower, ResourceLocation texture, boolean MoreFeatured) {
		this.mc.getTextureManager().bindTexture(texture);
		GL11.glPushMatrix();
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);    
		GL11.glEnable( GL11.GL_BLEND );
		if(MoreFeatured) {
			Gui.drawModalRectWithCustomSizedTexture(x - 24, lower ? y + 2 : y, 0.0F, 0.0F, 24, 24, 24, 24);
		}else {
			Gui.drawModalRectWithCustomSizedTexture(x - 20, lower ? y + 7 : y, 0.0F, 0.0F, 16, 16, 16, 16);
		}
  ...
