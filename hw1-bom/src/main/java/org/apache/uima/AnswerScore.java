

/* First created by JCasGen Tue Sep 10 22:48:16 EDT 2013 */
package org.apache.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 22:48:16 EDT 2013
 * XML source: /Users/mabodx/git/hw1-bom/hw1-bom/src/main/resources/hw1-bom-typesystem.xml
 * @generated */
public class AnswerScore extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScore.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnswerScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerScore(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets 
   * @generated */
  public String getCasProcessorId() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "org.apache.uima.AnswerScore");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets  
   * @generated */
  public void setCasProcessorId(String v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "org.apache.uima.AnswerScore");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_casProcessorId, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets 
   * @generated */
  public int getScore() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.apache.uima.AnswerScore");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets  
   * @generated */
  public void setScore(int v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.apache.uima.AnswerScore");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_score, v);}    
  }

    