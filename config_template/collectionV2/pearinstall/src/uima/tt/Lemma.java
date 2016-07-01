

/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
package uima.tt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Morphological information retrieved from a lexical dictionary entry
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * XML source: C:/CAX/solr-4.9.0/example/solr/COLGROUP-DEV-MasterTemplate/pearinstall/desc/aeDescriptor.xml
 * @generated */
public class Lemma extends KeyStringEntry {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Lemma.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Lemma() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Lemma(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Lemma(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: partOfSpeech

  /** getter for partOfSpeech - gets An integral encoding representing the part-of-speech for the lemma
   * @generated
   * @return value of the feature 
   */
  public int getPartOfSpeech() {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "uima.tt.Lemma");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Lemma_Type)jcasType).casFeatCode_partOfSpeech);}
    
  /** setter for partOfSpeech - sets An integral encoding representing the part-of-speech for the lemma 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPartOfSpeech(int v) {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "uima.tt.Lemma");
    jcasType.ll_cas.ll_setIntValue(addr, ((Lemma_Type)jcasType).casFeatCode_partOfSpeech, v);}    
   
    
  //*--------------*
  //* Feature: frost_ExtendedPOS

  /** getter for frost_ExtendedPOS - gets An integer representing additional information related to the part-of-speech
   * @generated
   * @return value of the feature 
   */
  public int getFrost_ExtendedPOS() {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_frost_ExtendedPOS == null)
      jcasType.jcas.throwFeatMissing("frost_ExtendedPOS", "uima.tt.Lemma");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Lemma_Type)jcasType).casFeatCode_frost_ExtendedPOS);}
    
  /** setter for frost_ExtendedPOS - sets An integer representing additional information related to the part-of-speech 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrost_ExtendedPOS(int v) {
    if (Lemma_Type.featOkTst && ((Lemma_Type)jcasType).casFeat_frost_ExtendedPOS == null)
      jcasType.jcas.throwFeatMissing("frost_ExtendedPOS", "uima.tt.Lemma");
    jcasType.ll_cas.ll_setIntValue(addr, ((Lemma_Type)jcasType).casFeatCode_frost_ExtendedPOS, v);}    
  }

    