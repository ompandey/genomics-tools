/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.genomics.model;

/**
 * Model definition for Read.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 */
@SuppressWarnings("javadoc")
public final class Read extends com.google.api.client.json.GenericJson {

  /**
   * The originalBases after the cigar field has been applied. Deletions are represented with '-'
   * and insertions are omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alignedBases;

  /**
   * Represents the quality of each base in this read. Each character represents one base. To get
   * the quality, take the ASCII value of the character and subtract 33.(QUAL)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String baseQuality;

  /**
   * A condensed representation of how this read matches up to the reference. (CIGAR)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cigar;

  /**
   * Each bit of this number has a different meaning if enabled. See the full BAM spec for more
   * details. (FLAG)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer flags;

  /**
   * The read ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * A score up to 255 that represents how likely this read's aligned position is correct. A higher
   * value is better. (MAPQ)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer mappingQuality;

  /**
   * The 1-based start position of the paired read. (PNEXT)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer matePosition;

  /**
   * The name of the sequence that the paired read is aligned to. This is usually the same as
   * referenceSequenceName. (RNEXT)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mateReferenceSequenceName;

  /**
   * The name of the read. When imported from a BAM file, this is the query template name. (QNAME)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The list of bases that this read represents (e.g. 'CATCGA'). (SEQ)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalBases;

  /**
   * The 1-based start position of the aligned read. If the first base starts at the very beginning
   * of the reference sequence, then the position would be '1'. (POS)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer position;

  /**
   * The ID of the readset this read belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String readsetId;

  /**
   * The name of the sequence that this read is aligned to. This would be 'X' for the X Chromosome
   * or '20' for Chromosome 20. (RNAME)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referenceSequenceName;

  /**
   * A list of additional read information. (TAG)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Tag> tags;

  /**
   * Length of the original piece of dna that produced both this read and the paired read. (TLEN)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer templateLength;

  /**
   * The originalBases after the cigar field has been applied. Deletions are represented with '-'
   * and insertions are omitted.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlignedBases() {
    return alignedBases;
  }

  /**
   * The originalBases after the cigar field has been applied. Deletions are represented with '-'
   * and insertions are omitted.
   * @param alignedBases alignedBases or {@code null} for none
   */
  public Read setAlignedBases(java.lang.String alignedBases) {
    this.alignedBases = alignedBases;
    return this;
  }

  /**
   * Represents the quality of each base in this read. Each character represents one base. To get
   * the quality, take the ASCII value of the character and subtract 33.(QUAL)
   * @return value or {@code null} for none
   */
  public java.lang.String getBaseQuality() {
    return baseQuality;
  }

  /**
   * Represents the quality of each base in this read. Each character represents one base. To get
   * the quality, take the ASCII value of the character and subtract 33.(QUAL)
   * @param baseQuality baseQuality or {@code null} for none
   */
  public Read setBaseQuality(java.lang.String baseQuality) {
    this.baseQuality = baseQuality;
    return this;
  }

  /**
   * A condensed representation of how this read matches up to the reference. (CIGAR)
   * @return value or {@code null} for none
   */
  public java.lang.String getCigar() {
    return cigar;
  }

  /**
   * A condensed representation of how this read matches up to the reference. (CIGAR)
   * @param cigar cigar or {@code null} for none
   */
  public Read setCigar(java.lang.String cigar) {
    this.cigar = cigar;
    return this;
  }

  /**
   * Each bit of this number has a different meaning if enabled. See the full BAM spec for more
   * details. (FLAG)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFlags() {
    return flags;
  }

  /**
   * Each bit of this number has a different meaning if enabled. See the full BAM spec for more
   * details. (FLAG)
   * @param flags flags or {@code null} for none
   */
  public Read setFlags(java.lang.Integer flags) {
    this.flags = flags;
    return this;
  }

  /**
   * The read ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The read ID.
   * @param id id or {@code null} for none
   */
  public Read setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * A score up to 255 that represents how likely this read's aligned position is correct. A higher
   * value is better. (MAPQ)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMappingQuality() {
    return mappingQuality;
  }

  /**
   * A score up to 255 that represents how likely this read's aligned position is correct. A higher
   * value is better. (MAPQ)
   * @param mappingQuality mappingQuality or {@code null} for none
   */
  public Read setMappingQuality(java.lang.Integer mappingQuality) {
    this.mappingQuality = mappingQuality;
    return this;
  }

  /**
   * The 1-based start position of the paired read. (PNEXT)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMatePosition() {
    return matePosition;
  }

  /**
   * The 1-based start position of the paired read. (PNEXT)
   * @param matePosition matePosition or {@code null} for none
   */
  public Read setMatePosition(java.lang.Integer matePosition) {
    this.matePosition = matePosition;
    return this;
  }

  /**
   * The name of the sequence that the paired read is aligned to. This is usually the same as
   * referenceSequenceName. (RNEXT)
   * @return value or {@code null} for none
   */
  public java.lang.String getMateReferenceSequenceName() {
    return mateReferenceSequenceName;
  }

  /**
   * The name of the sequence that the paired read is aligned to. This is usually the same as
   * referenceSequenceName. (RNEXT)
   * @param mateReferenceSequenceName mateReferenceSequenceName or {@code null} for none
   */
  public Read setMateReferenceSequenceName(java.lang.String mateReferenceSequenceName) {
    this.mateReferenceSequenceName = mateReferenceSequenceName;
    return this;
  }

  /**
   * The name of the read. When imported from a BAM file, this is the query template name. (QNAME)
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the read. When imported from a BAM file, this is the query template name. (QNAME)
   * @param name name or {@code null} for none
   */
  public Read setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The list of bases that this read represents (e.g. 'CATCGA'). (SEQ)
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalBases() {
    return originalBases;
  }

  /**
   * The list of bases that this read represents (e.g. 'CATCGA'). (SEQ)
   * @param originalBases originalBases or {@code null} for none
   */
  public Read setOriginalBases(java.lang.String originalBases) {
    this.originalBases = originalBases;
    return this;
  }

  /**
   * The 1-based start position of the aligned read. If the first base starts at the very beginning
   * of the reference sequence, then the position would be '1'. (POS)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPosition() {
    return position;
  }

  /**
   * The 1-based start position of the aligned read. If the first base starts at the very beginning
   * of the reference sequence, then the position would be '1'. (POS)
   * @param position position or {@code null} for none
   */
  public Read setPosition(java.lang.Integer position) {
    this.position = position;
    return this;
  }

  /**
   * The ID of the readset this read belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getReadsetId() {
    return readsetId;
  }

  /**
   * The ID of the readset this read belongs to.
   * @param readsetId readsetId or {@code null} for none
   */
  public Read setReadsetId(java.lang.String readsetId) {
    this.readsetId = readsetId;
    return this;
  }

  /**
   * The name of the sequence that this read is aligned to. This would be 'X' for the X Chromosome
   * or '20' for Chromosome 20. (RNAME)
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceSequenceName() {
    return referenceSequenceName;
  }

  /**
   * The name of the sequence that this read is aligned to. This would be 'X' for the X Chromosome
   * or '20' for Chromosome 20. (RNAME)
   * @param referenceSequenceName referenceSequenceName or {@code null} for none
   */
  public Read setReferenceSequenceName(java.lang.String referenceSequenceName) {
    this.referenceSequenceName = referenceSequenceName;
    return this;
  }

  /**
   * A list of additional read information. (TAG)
   * @return value or {@code null} for none
   */
  public java.util.List<Tag> getTags() {
    return tags;
  }

  /**
   * A list of additional read information. (TAG)
   * @param tags tags or {@code null} for none
   */
  public Read setTags(java.util.List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Length of the original piece of dna that produced both this read and the paired read. (TLEN)
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTemplateLength() {
    return templateLength;
  }

  /**
   * Length of the original piece of dna that produced both this read and the paired read. (TLEN)
   * @param templateLength templateLength or {@code null} for none
   */
  public Read setTemplateLength(java.lang.Integer templateLength) {
    this.templateLength = templateLength;
    return this;
  }

  @Override
  public Read set(String fieldName, Object value) {
    return (Read) super.set(fieldName, value);
  }

  @Override
  public Read clone() {
    return (Read) super.clone();
  }

}
