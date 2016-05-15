package org.toxiccloudgaming.blockminer.registry;

import org.toxiccloudgaming.blockminer.info.WIP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//This class is used to change in-game text depending on the language.
@WIP
public class LanguageRegistry {

    //Global LanguageRegistry object. Change if you wish to extend this class.
    private static LanguageRegistry globalLanguageRegistry;

    //The default language for BlockMiner.
    public static final String LANGUAGE_DEFAULT = Localizable.EN_US;

    //The current language in use.
    private String language;

    //The map of unlocalized strings and their translation.
    private Map<String, String> languageLibrary;
    private static ArrayList<String> entries = new ArrayList<String>();

    public LanguageRegistry(String language) {
        this.language = LANGUAGE_DEFAULT;
        this.initLanguageLibrary();
    }

    public LanguageRegistry() {
        this(LANGUAGE_DEFAULT);
    }

    //Sets the global LanguageRegistry.
    public static void setLanguageRegistry(LanguageRegistry languageRegistry) {
        globalLanguageRegistry = languageRegistry;
    }

    //Gets the global LanguageRegistry.
    public static LanguageRegistry getLanguageRegistry() {
        return globalLanguageRegistry;
    }

    //Setup the new language library.
    private void initLanguageLibrary() {
        this.languageLibrary = new HashMap<String, String>();
        //TODO populate languageLibrary list with values read from file.
    }

    //Register a new LanguageEntry.
    public static void registerEntry(LanguageEntry entry) {
        entries.add(entry.getUnlocalizedName());
    }

    //Remove a LanguageEntry.
    public static void unregisterEntry(LanguageEntry entry) {
        entries.remove(entry.getUnlocalizedName());
    }

    //Get the localized name of a LanguageEntry.
    public String getLocalizedValue(LanguageEntry entry) {
        String name = this.languageLibrary.get(entry.getUnlocalizedName());
        if(name == null) {
            try {
                throw new MissingLanguageEntryException(entry.getUnlocalizedName());
            } catch (MissingLanguageEntryException e) {
                e.printStackTrace();
            }
        }
        return name;
    }

    //Exception that is thrown if an entry is not found in the entry list.
    public class MissingLanguageEntryException extends Exception {

        public MissingLanguageEntryException(String name) {
            super("MissingLanguageEntryException: entry for " + name + " was not found!");
        }
    }
}
