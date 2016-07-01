

/* First created by JCasGen Mon Jun 06 12:46:23 ICT 2016 */
package uima.tt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** Base type for token annotation types
 * Updated by JCasGen Mon Jun 06 12:46:23 ICT 2016
 * XML source: C:/CAX/solr-4.9.0/example/solr/COLGROUP-DEV-MasterTemplate/pearinstall/desc/aeDescriptor.xml
 * @generated */
public class TokenLikeAnnotation extends LexicalAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenLikeAnnotation.class);
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
  protected TokenLikeAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TokenLikeAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TokenLikeAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TokenLikeAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
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
  //* Feature: lemma

  /** getter for lemma - gets The best probable entry containing all morphological information for the token
   * @generated
   * @return value of the feature 
   */
  public Lemma getLemma() {
    if (TokenLikeAnnotation_Type.featOkTst && ((TokenLikeAnnotation_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "uima.tt.TokenLikeAnnotation");
    return (Lemma)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenLikeAnnotation_Type)jcasType).casFeatCode_lemma)));}
    
  /** setter for lemma - sets The best probable entry containing all morphological information for the token 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLemma(Lemma v) {
    if (TokenLikeAnnotation_Type.featOkTst && ((TokenLikeAnnotation_Type)jcasType).casFeat_lemma == null)
      jcasType.jcas.throwFeatMissing("lemma", "uima.tt.TokenLikeAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenLikeAnnotation_Type)jcasType).casFeatCode_lemma, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: lemmaEntries

  /** getter for lemmaEntries - gets List of lemma entries containing all morphological information for the token
   * @generated
   * @return value of the feature 
   */
  public FSArray getLemmaEntries() {
    if (TokenLikeAnnotation_Type.featOkTst && ((TokenLikeAnnotation_Type)jcasType).casFeat_lemmaEntries == null)
      jcasType.jcas.throwFeatMissing("lemmaEntries", "uima.tt.TokenLikeAnnotation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenLikeAnnotation_Type)jcasType).casFeatCode_lemmaEntries)));}
    
  /** setter for lemmaEntries - sets List of lemma entries containing all morphological information for the token 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLemmaEntries(FSArray v) {
    if (TokenLikeAnnotation_Type.featOkTst && ((TokenLikeAnnotation_Type)jcasType).casFeat_lemmaEntries == null)
      jcasType.jcas.throwFeatMissing("lemmaEntries", "uima.tt.TokenLikeAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenLikeAnnotation_Type)jcasType).casFeatCode_lemmaEntries, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for lemmaEntries - gets an indexed value - List of lemma entries containing all morphological information for the token
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TOP getLemmaEntries(int i) {
    if (TokenLikeAnnotation_Type.featOkTst && ((TokenLikeAnnotation_Type)jcasType).casFeat_lemmaEntries == null)
      jcasType.jcas.throwFeatMissing("lemmaEntries", "uima.tt.TokenLikeAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TokenLikeAnnotation_Type)jcasType).casFeatCode_lemmaEntries), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TokenLikeAnnotation_Type)jcasType).casFeatCode_lemmaEntries), i)));}

  /** indexed setter for lemmaEntries - sets an indexed value - List of lemma entries containing all morphological information for the token
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setLemmaEntries(int i, TOP v) { 
    if (TokenLikeAnnotation_Type.featOkTst && ((TokenLikeAnnotation_Type)jcasType).casFeat_lemmaEntries == null)
      jcasType.jcas.throwFeatMissing("lemmaEntries", "uima.tt.TokenLikeAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TokenLikeAnnotation_Type)jcasType).casFeatCode_lemmaEntries), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TokenLikeAnnotation_Type)jcasType).casFeatCode_lemmaEntries), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: dictionaryMatch

  /** getter for dictionaryMatch - gets A flag indicating whether or not the token matches a dictionary entry
   * @generated
   * @return value of the feature 
   */
  public boolean getDictionaryMatch() {
    if (TokenLikeAnnotation_Type.featOkTst && ((TokenLikeAnnotation_Type)jcasType).casFeat_dictionaryMatch == null)
      jcasType.jcas.throwFeatMissing("dictionaryMatch", "uima.tt.TokenLikeAnnotation");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((TokenLikeAnnotation_Type)jcasType).casFeatCode_dictionaryMatch);}
    
  /** setter for dictionaryMatch - sets A flag indicating whether or not the token matches a dictionary entry 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDictionaryMatch(boolean v) {
    if (TokenLikeAnnotation_Type.featOkTst && ((TokenLikeAnnotation_Type)jcasType).casFeat_dictionaryMatch == null)
      jcasType.jcas.throwFeatMissing("dictionaryMatch", "uima.tt.TokenLikeAnnotation");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((TokenLikeAnnotation_Type)jcasType).casFeatCode_dictionaryMatch, v);}    
  }

    