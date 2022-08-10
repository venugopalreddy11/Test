import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FinancialCommitmentsComponent } from './financial-commitments.component';

describe('FinancialCommitmentsComponent', () => {
  let component: FinancialCommitmentsComponent;
  let fixture: ComponentFixture<FinancialCommitmentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FinancialCommitmentsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FinancialCommitmentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
