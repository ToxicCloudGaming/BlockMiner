package org.toxiccloudgaming.blockminer.language;

//All objects which can be translated extend Entry.
public abstract class LanguageEntry implements Localizable {

    //An object's unlocalized name.
    private String name;

    //Sets the name in specified language.
    @Override
    public void setLocalizedName(String name, String language) {
        //TODO setup LanguageEntry setLocalizedName() 1
    }

    //Sets the name in the default language.
    @Override
    public void setLocalizedName(String name) {
        this.setLocalizedName(name, LanguageRegistry.LANGUAGE_DEFAULT);
    }

    @Override
    public void setUnlocalizedName(String name) {
        this.name = name;
    }

    @Override
    public String getUnlocalizedName() {
        return this.name;
    }

    //Returns the translated name of the object for display.
    @Override
    public String toString() {
        return LanguageRegistry.getLanguageRegistry().getLocalizedValue(this);
    }

    //Registers this entry to the LanguageRegistry.
    protected void registerEntry() {
        LanguageRegistry.registerEntry(this);
    }
}
